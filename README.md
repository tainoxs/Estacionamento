# README

## Sistema de Estacionamento

Este é um sistema simples em Java que gerencia tickets de um estacionamento. Ele permite gerar tickets, adicionar tempo, pagar tickets e acompanhar o saldo total arrecadado. Este projeto é composto por três classes principais: `Console`, `Estacionamento` e `TicketsGerados`.

---

### Estrutura do Projeto

#### 1. **Classe `Console`**
A classe principal que interage com o usuário.  
Apresenta um menu de opções e chama os métodos correspondentes da classe `Estacionamento`.

##### Principais Funções
- **Exibição do menu interativo**  
  Permite ao usuário escolher as operações (gerar ticket, pagar, adicionar tempo, etc.).

- **Entrada de Dados**  
  Lida com entradas via console para capturar as escolhas e valores informados pelo usuário.

- **Encerramento do programa**  
  Permite finalizar o sistema de forma segura.

---

#### 2. **Classe `Estacionamento`**
Gerencia a lógica de negócios do sistema.  
Controla os tickets gerados, calcula valores e realiza operações financeiras.

##### Atributos
- **`ArrayList<TicketsGerados> listaDeTickets`**  
  Armazena todos os tickets gerados.

- **`double total`**  
  Saldo total arrecadado pelo estacionamento.

##### Métodos Principais
- **`gerarTicket()`**  
  Cria um novo ticket com um número único gerado aleatoriamente e valor inicial de R$7,00.

- **`pagarTicket(int numeroDoTicket)`**  
  Marca o ticket como pago e atualiza o saldo total.

- **`verTicketsGerados()`**  
  Lista todos os tickets e seus status (pago ou não pago).

- **`verTicketsGeradosSemValor()`**  
  Exibe apenas os tickets que ainda não foram pagos, junto com seus valores.

- **`adicionarTempo(int hora)`**  
  Simula a passagem de tempo ao adicionar horas extras aos tickets não pagos, com um custo adicional de R$3 por hora.

- **`verSaldo()`**  
  Mostra o saldo total arrecadado pelo estacionamento.

---

#### 3. **Classe `TicketsGerados`**
Representa cada ticket gerado no sistema.

##### Atributos
- **`int ticket`**  
  Número único do ticket.

- **`double valor`**  
  Valor atual do ticket (inicia com R$7,00 e aumenta com o tempo).

- **`boolean pago`**  
  Status do ticket (pago ou não pago).

##### Construtores
- **`TicketsGerados(int ticket, double valor, boolean pago)`**  
  Inicializa um ticket com valores personalizados.

- **`TicketsGerados(int ticket, boolean pago)`**  
  Inicializa um ticket com valores padrão (valor inicial de R$7,00).

---

### Funcionalidades

1. **Gerar Ticket**  
   Cria um novo ticket com um número único e valor inicial de R$7,00.

2. **Adicionar Tempo**  
   Simula a permanência do veículo ao adicionar horas extras ao ticket. Cada hora adicional custa R$3,00.

3. **Pagar Ticket**  
   Realiza o pagamento de um ticket, marcando-o como pago e adicionando o valor ao saldo total.

4. **Ver Tickets e Status**  
   Lista todos os tickets com seus respectivos status (pago/não pago) e valores.

5. **Ver Saldo**  
   Exibe o saldo total arrecadado pelo estacionamento.

6. **Encerrar Programa**  
   Finaliza a execução do sistema.

---

### Requisitos

- **Java Development Kit (JDK)** instalado para compilar e executar o programa.  
- Editor ou IDE (como IntelliJ IDEA ou Eclipse) para editar e executar o código.

---

### Exemplo de Uso

Ao executar o programa, o seguinte menu será exibido no console:

```
OLÁ ESSE É O SISTEMA DE ESTACIONAMENTO DO SHOPPING!
TAXA FIXA: R$7
CADA HORA: R$3

Digite:
1- Gerar ticket
2- Ver tickets e status
3- Pagar ticket
4- Adicionar tempo em hora (simular)
5- Ver saldo
6- Encerrar programa
```

Siga as instruções para interagir com o sistema.

---

### Melhorias Futuras
- Implementação de persistência de dados (ex.: banco de dados ou arquivos).
- Interface gráfica para melhor experiência do usuário.
- Opção para remoção de tickets antigos.
- Implementação de tarifas diferenciadas por períodos do dia.

---

**Desenvolvido por:** *Seu Nome Aqui*  
**Tecnologias:** Java
