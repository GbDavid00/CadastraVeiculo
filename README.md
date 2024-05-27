## README para o Projeto de Veículos

**Descrição**

Este projeto implementa um sistema básico para cadastro e consulta de informações sobre diversos tipos de veículos, incluindo:

* **Motos:** nome, cor, combustivel, portas, rodas, cilindrada e se é flex.
* **Carretas:** nome, cor, combustivel, portas, rodas e eixos.
* **Aviões:** nome, cor, combustivel, portas, rodas, motores, tipo de carga.
* **Trens:** nome, cor, combustivel, portas, rodas, tipo de carga e quantidade de vagões.

**Funcionalidades**

O sistema oferece as seguintes funcionalidades:

* **Cadastro de veículos:** permite cadastrar novas motos, carretas, aviões e trens, inserindo as informações específicas de cada tipo de veículo.
* **Consulta de veículos:** permite consultar as informações de um veículo específico, pesquisando por tipo (moto, carreta, avião ou trem) e nome.
* **Menu interativo:** um menu facilita a navegação entre as opções de cadastro e consulta de veículos.

**Tecnologias Utilizadas**

* **Java:** linguagem de programação utilizada para o desenvolvimento do sistema.
* **Scanner:** biblioteca para leitura de dados do teclado.
* **Conceitos de POO:** classes, herança, polimorfismo e encapsulamento foram utilizados para estruturar o código e facilitar a reutilização.

**Instruções de Uso**

1. Clone o repositório do projeto no seu computador.
2. Compile o código Java utilizando um compilador Java.
3. Execute o arquivo `App.class` para iniciar o programa.
4. Siga as instruções no menu para cadastrar ou consultar veículos.


**Exemplos de Uso**

**Cadastrar uma moto com 200 cilindradas e flex:**

```
============== W E L C O M E ==============
Escolha uma opção abaixo:
1 = Cadastrar uma moto
2 = Cadastrar uma carreta
3 = Cadastrar um aviao
4 = Cadastrar um trem
5 = Verificar veiculo
6 = Sair
1

Defina um nome: Titan X
Digite uma cor: Preta
Defina combustivel: Gasolina
Defina o numero de portas: 0
Defina o numero de rodas: 2
Defina o numero de cilindradas: 200
veiculo Flex? S/N: S

============== W E L C O M E ==============
Escolha uma opção abaixo:
1 = Cadastrar uma moto
2 = Cadastrar uma carreta
3 = Cadastrar um aviao
4 = Cadastrar um trem
5 = Verificar veiculo
6 = Sair
...
```

**Consultar as informações de um avião:**

```
============== W E L C O M E ==============
Escolha uma opção abaixo:
1 = Cadastrar uma moto
2 = Cadastrar uma carreta
3 = Cadastrar um aviao
4 = Cadastrar um trem
5 = Verificar veiculo
6 = Sair
5

Escolha uma opção abaixo:
1 = Moto
2 = Carreta
3 = Aviao
4 = Trem
5 = Voltar ao menu
3

Nome: Boing 747
Cor: Branco
Combustivel: Querosene
Quantidade de portas: 4
Quantidade de rodas: 6
Quantidade de Motores: 4
Tipo de Carga: Passageiros

============== W E L C O M E ==============
Escolha uma opção abaixo:
1 = Cadastrar uma moto
2 = Cadastrar uma carreta
3 = Cadastrar um aviao
4 = Cadastrar um trem
5 = Verificar veiculo
6 = Sair
...
```

**Observações**

* Este é um projeto básico e pode ser expandido para incluir mais funcionalidades, como edição e exclusão de veículos, filtros de consulta e geração de relatórios.
* A documentação do código pode ser aprimorada para facilitar a compreensão e a reutilização do projeto.
* Testes automatizados podem ser implementados para garantir a qualidade do código e a confiabilidade do sistema.

**Agradecimentos**

Agradeço ao Gemini que fez esse ReadMe hahahaha!