# alura-exerc
Exercício para uma vaga de estágio na Alura

<br>
<h2>Exercício 1. Encontre o telefone</h2>

Em alguns lugares do mundo é comum que o número de telefone seja descrito em uma mistura de letras e números. Por exemplo, o telefone 1-800-ALURA é equivalente a 1-800-25872, que na verdade é o mesmo que 180025872.

Parte 1. Escreva o código que, dado uma String com um número de telefone que contem também letras, devolve uma String com o número de telefone puro, somente números, sem letras nem hífens.

Exemplo: 1-800-ALURA => 180025872
Exemplo: 1-800-25872 => 180025872
Exemplo: 55CAELUM => 55223586

<strong>Obs:</strong> Eu tomei a liberdade de que erros de input seriam descartados do resultado final. Como caracteres especiais e espaços em branco

<br>
<h2>Exercício 2. SQL</h2>

Dadas as seguintes tabelas:

Usuario:
id integer primary key, nome varchar(255)

Email:
id integer primary key, usuario_id integer,
email varchar(255)

Compra:
id integer primary key, usuario_id integer,
valor decimal(10,2), momentoDaCompra datetime

Parte 1. Crie uma query select para trazer quantos usuários fizeram compras entre 30 e 29 dias atrás, independentemente de que dia é hoje. O resultado da query é um único número!

Parte 2. Quais testes você faria para garantir que a query funciona exatamente como deveria? Escreva os INSERTs que faria e o resultado esperado para cada teste.
