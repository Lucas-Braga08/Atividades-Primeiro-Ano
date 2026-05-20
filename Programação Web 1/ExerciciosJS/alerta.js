function checarTemperatura(t) {
if (t < 10) return "Alerta de Frio";
if (t <= 25) return "Temperatura Ideal";
return "Alerta de Calor";
}
function executar() {
const t = Number(document.getElementById("temp").value);
document.getElementById("resultado").innerText = checarTemperatura(t);
}