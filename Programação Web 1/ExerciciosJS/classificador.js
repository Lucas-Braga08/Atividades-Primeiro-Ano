function classificarMoeda(valor) {
if (valor < 0) return "Valor Desconhecido";

if (valor >= 1 && valor <= 10) {
const parteInteira = Math.floor(valor);
const centavos = Math.round((valor - parteInteira) * 100);

if (centavos === 0) {
return parteInteira + " real" + (parteInteira > 1 ? "s" : "");
}

return parteInteira + " real" + (parteInteira > 1 ? "s" : "") +
" e " + centavos + " centavos";
}

if (valor > 0 && valor < 1) {
const centavos = Math.round(valor * 100);
return centavos + " centavos";
}

return "Valor Desconhecido";
}

function executar() {
const v = Number(document.getElementById("moeda").value);
document.getElementById("resultado").innerText = classificarMoeda(v);
}