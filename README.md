# Repositório de Exercícios de Programação em Java

Este repositório contém diversas implementações de exercícios de programação em Java, abordando conceitos fundamentais como herança, polimorfismo, encapsulamento, abstração e muito mais. Cada exercício está separado por temática e visa ilustrar diferentes aspectos da programação orientada a objetos e suas aplicações.

## Exercícios Implementados

### Herança Básica
**Objetivo**: Criar uma classe base Pessoa com atributos nome e idade. A classe Aluno herda de Pessoa e possui um atributo adicional matricula.
**Aplicação**: Demonstra como a herança é utilizada para reutilizar e estender classes em Java.

### Encapsulamento
**Objetivo**: Criar classes Banco e Conta com atributos privados, e fornecer métodos getters e setters para manipular esses atributos.
**Aplicação**: Ilustra o conceito de encapsulamento e o uso de modificadores de acesso para proteger dados.

### Criação de uma Hierarquia de Classes
**Objetivo**: Criar uma classe Funcionario com atributos nome e salario. Em seguida, criar as subclasses Gerente e Desenvolvedor, implementando um método calcularBonus para cada uma.
**Aplicação**: Demonstra herança com subclasses e o uso de métodos protected para controle de acesso.

### Sobrescrita de Métodos
**Objetivo**: Criar o método trabalhar() na classe base Funcionario e sobrescrevê-lo nas subclasses Gerente e Desenvolvedor.
**Aplicação**: Utiliza a anotação @Override para sobrescrever métodos, garantindo polimorfismo.

### Polimorfismo com Interfaces
**Objetivo**: Criar uma interface IMeioTransporte com métodos acelerar() e frear(). Implementar em classes Carro, Bicicleta e Trem, e utilizá-las em um array polimórfico.
**Aplicação**: Demonstra o conceito de polimorfismo através de interfaces.

### Polimorfismo com Classes Abstratas
**Objetivo**: Criar uma classe abstrata Animal com um método abstrato emitirSom(). Implementar as subclasses Cachorro, Gato e Vaca, cada uma com sua própria implementação de som.
**Aplicação**: Usa classes abstratas para definir métodos que serão implementados de maneiras diferentes nas subclasses.

### Abstração em um Sistema de Pagamentos
**Objetivo**: Criar uma classe abstrata FormaPagamento com métodos abstratos processarPagamento(double valor) e validarPagamento(). Implementar as classes CartaoCredito, Boleto e Pix.
**Aplicação**: Demonstra a aplicação prática da abstração em um sistema de pagamentos.

### Sistema de Gestão de Funcionários
**Objetivo**: Gerenciar diferentes tipos de funcionários (Gerente, Desenvolvedor, Estagiario), cada um com sua forma específica de calcular salário e bônus. Possibilita a promoção de um funcionário, alterando seu tipo.
**Aplicação**: Combina herança, polimorfismo e encapsulamento em um sistema de folha de pagamento.

## Como Baixar e Executar

1. **Clone o Repositório:**
   Abra um terminal e execute o comando abaixo para clonar o repositório para sua máquina local:
   ```bash
   git clone https://github.com/GuilhermeRCabreira/Lista-Java-OO.git

2. **Acesse o Diretório do Projeto:**

   ```bash
   cd Lista-Java-OO

3. **Compile o Código:**
   Certifique-se de que você tem o JDK instalado. Compile o código Java com o seguinte comando:

   ```bash
   javac -d bin src/**/*.java

4. **Execute as Aplicações:**
   Navegue até o diretório src e execute a classe principal. 
   ```bash
   cd bin
   java Main
