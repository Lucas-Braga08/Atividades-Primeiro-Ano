
function encontrarMaiorEntreTres(a, b, c) {
  if (a >= b && a >= c) return a;
  if (b >= a && b >= c) return b;
  return c;
}

function executar() {
  const rawA = document.getElementById("a").value.trim();
  const rawB = document.getElementById("b").value.trim();
  const rawC = document.getElementById("c").value.trim();
  const resultadoEl = document.getElementById("resultado");

  if (rawA === "" || rawB === "" || rawC === "") {
    resultadoEl.innerText = "Por favor preencha os três valores.";
    return;
  }

  const a = Number(rawA);
  const b = Number(rawB);
  const c = Number(rawC);

  if (Number.isNaN(a) || Number.isNaN(b) || Number.isNaN(c)) {
    resultadoEl.innerText = "Insira apenas números válidos.";
    return;
  }

  const maior = encontrarMaiorEntreTres(a, b, c);
  const empates = [];
  if (a === maior) empates.push(`A=${a}`);
  if (b === maior) empates.push(`B=${b}`);
  if (c === maior) empates.push(`C=${c}`);

  if (empates.length > 1) {
    resultadoEl.innerText = `Maior: ${maior} (empate entre ${empates.join(", ")})`;
  } else {
    resultadoEl.innerText = `Maior: ${maior}`;
  }
}
