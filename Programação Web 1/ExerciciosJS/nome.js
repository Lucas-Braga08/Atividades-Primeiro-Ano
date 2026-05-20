function gerarNomeCompleto(obj) {
return obj.primeiroNome + " " + obj.sobrenome;
}
function executar() {
const obj = {
primeiroNome: document.getElementById("pNome").value,
sobrenome: document.getElementById("sNome").value
};
document.getElementById("resultado").innerText = gerarNomeCompleto(obj);
}