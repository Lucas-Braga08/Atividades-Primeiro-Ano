function tipoTriangulo(a, b, c) {
if (a == b && b == c) return "Equilátero";
if (a == b || a == c || b == c) return "Isósceles";
return "Escaleno";
}
function executar() {
const a = document.getElementById("l1").value;
const b = document.getElementById("l2").value;
const c = document.getElementById("l3").value;
document.getElementById("resultado").innerText = tipoTriangulo(a, b, c);
}