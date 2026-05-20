function verificar() {
    var numero = document.getElementById('numero').value;

    if (numero === "") {
        document.getElementById('resultado').innerText = "Digite um número!";
        return;
    }

    if (numero % 2 == 0) {
        document.getElementById('resultado').innerText = "O número " + numero + " é par.";
    } else {
        document.getElementById('resultado').innerText = "O número " + numero + " é ímpar.";
    }
}
