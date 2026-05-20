function calcularMediaSimples(n1, n2) {
const m = (n1 + n2) / 2;
return m >= 7 ? "Aprovado" : "Reprovado";
}
function executar() {
const n1 = Number(document.getElementById("n1").value);
const n2 = Number(document.getElementById("n2").value);
document.getElementById("resultado").innerText = calcularMediaSimples(n1, n2);
}