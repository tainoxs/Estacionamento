# README

## Sistema de Estacionamento

Este é um programa simples em Java que simula o funcionamento de um sistema de gerenciamento de estacionamento para um shopping. Ele permite que o usuário gere tickets, simule o tempo de permanência, calcule os custos associados e realize pagamentos.

### Funcionalidades

1. **Gerar Ticket**  
   Permite gerar um novo ticket para um veículo estacionado.

2. **Ver Tickets e Status**  
   Exibe todos os tickets gerados, incluindo seus respectivos status e custos.

3. **Pagar Ticket**  
   Realiza o pagamento de um ticket específico.

4. **Adicionar Tempo (Simulação)**  
   Simula a passagem de tempo adicionando horas ao ticket ativo.

5. **Ver Saldo**  
   Mostra o saldo total arrecadado pelo sistema.

6. **Encerrar Programa**  
   Finaliza a execução do sistema.

### Como Usar

1. Execute o programa.  
   O sistema exibirá um menu interativo com as opções disponíveis.

2. Escolha uma opção digitando o número correspondente e pressione `Enter`.  
   Por exemplo, para gerar um ticket, digite `1` e pressione `Enter`.

3. Siga as instruções exibidas no console para cada funcionalidade.

4. Para finalizar o programa, selecione a opção `6`.

### Exemplo de Uso

1. O programa inicia com a mensagem:
   ```
   OLÁ ESSE É O SISTEMA DE ESTACIONAMENTO DO SHOPPING!
   TAXA FIXA: R$7
   CADA HORA: R$3
   ```

2. Escolha uma opção no menu:
   ```
   Digite:
   1- Gerar ticket
   2- Ver tickets e status
   3- Pagar ticket
   4- Adicionar tempo em hora (simular)
   5- Ver saldo
   6- Encerrar programa
   ```

3. O sistema orienta o usuário em cada etapa para realizar as ações desejadas.

### Taxas e Custos

- Taxa fixa: **R$7**  
- Custo adicional por hora: **R$3**

### Requisitos

- **Java Development Kit (JDK)** instalado para compilar e executar o programa.  
- Editor ou IDE para editar o código (opcional).

### Estrutura do Código

- **Classe Principal (`Console`)**  
  Gerencia a interação com o usuário, apresentando o menu e chamando métodos da classe `Estacionamento`.

- **Classe `Estacionamento` (não incluída neste código)**  
  Responsável por implementar as funcionalidades de gerenciamento dos tickets e cálculo dos custos.

### Melhorias Futuras

- Interface gráfica para uma experiência mais amigável.  
- Persistência de dados para salvar os tickets em um banco de dados.  
- Validação aprimorada das entradas do usuário.

---

Desenvolvido como um exercício de programação em Java.
