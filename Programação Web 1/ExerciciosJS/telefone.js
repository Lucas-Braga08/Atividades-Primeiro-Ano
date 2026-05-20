function formatarTelefone(t) {
return t.slice(0, 4) + "-" + t.slice(4);
}
function executar() {
const t = document.getElementById("tel").value;
document.getElementById("resultado").innerText = formatarTelefone(t);
}