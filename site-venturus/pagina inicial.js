let isDragging = false;
let startX, startY, offsetX, offsetY, movedEnough = false;

const handle = document.getElementById('moveHandle');
const container = document.getElementById('accessibilityBtn');
const options = document.getElementById('accessibility-options');

// Mover apenas clicando no botão externo (ícone)
handle.addEventListener('mousedown', startDrag);

function startDrag(e) {
  if (e.button !== 0) return;
  const rect = container.getBoundingClientRect();
  offsetX = e.clientX - rect.left;
  offsetY = e.clientY - rect.top;
  startX = e.clientX;
  startY = e.clientY;
  movedEnough = false;

  document.addEventListener('mousemove', drag);
  document.addEventListener('mouseup', endDrag);
}

function drag(e) {
  const dx = Math.abs(e.clientX - startX);
  const dy = Math.abs(e.clientY - startY);

  if (dx > 3 || dy > 3) {
    movedEnough = true;
    container.style.left = (e.clientX - offsetX) + 'px';
    container.style.top = (e.clientY - offsetY) + 'px';
    container.style.bottom = 'unset';
  }
}

function endDrag(e) {
  document.removeEventListener('mousemove', drag);
  document.removeEventListener('mouseup', endDrag);

  if (!movedEnough) {
    toggleAccessibilityOptions();
  }
  movedEnough = false;
}

function toggleAccessibilityOptions() {
  options.style.display = options.style.display === 'block' ? 'none' : 'block';
}

// Controle de fonte
const slider = document.getElementById('font-slider');
slider.addEventListener('input', () => {
  document.body.style.fontSize = slider.value + 'px';
});

// Reset
function resetSettings() {
  document.body.style.fontSize = '16px';
  slider.value = 16;
}
