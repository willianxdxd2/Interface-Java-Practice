#Interface-Java-Practice
Aprendendo a utilizar interface no momento correto do código, para deixar a programação orientada a objetos mais organizada e esquematizada

#Tecnologias

-JAVA SE
-Eclipse

#Meu aprendizado
Aprendi que a interface deve ser usada como um contrato a ser seguido por outras classes, um esquema para racionalizar melhor o layout do código
serve como uma forma de visualizar e colocar em caixinhas classes semelhantes nem a necessecidade de utilizar herança, acredito que deva ser útil principalmente em sistemas grandes

#bônus- Todas as interfaces utlizaram Programação orientada a objetos de maneira massiva para fixar melhor o conteúdo na mente e a prática com varios exercicios.
#utilizei exemplos reais, como venda de equipamentos,saldo bancário e desconto de imposto

*EXERCÍCIOS INTERFACE*

1️⃣-Forma Geométrica 
Crie uma interface Forma com os métodos area() e perimetro(). Implemente as classes Circulo e Retangulo.(feito)

2️⃣-Controlador de Dispositivos
Crie uma interface Controlavel com os métodos ligar() e desligar(). Implemente Televisao, Radio e Ventilador.(feito)

3️⃣-Autenticação de Usuários
Crie uma interface Autenticavel com login() e logout(). Implemente nas classes Administrador e Cliente.(feito)

4️⃣-Interface de Pagamento
Crie uma interface Pagamento com o método processarPagamento(double valor). Implemente CartaoCredito e Boleto.(feito)

5️⃣ -Interface com Constantes
Crie uma interface ConstantesMatematicas contendo PI, E. Use-as em uma classe que calcula o volume de uma esfera.(Feito)

#Second commit
Aprofundando Tecnicas com interface

*INTERFACE COMPARABLE*

1️⃣ Alunos – Ranking por média
Criar classe Aluno (nome, mediaFinal).
Implementar Comparable<Aluno>.
Ordenar por média decrescente; em caso de empate, por nome crescente.
Usar Collections.sort().

2️⃣ Jogadores – Ranking online
Criar classe Jogador (nickname, pontuacao, nivel).
Implementar Comparable<Jogador>.
Ordenar por pontuação decrescente; se empatar, nível decrescente.

3️⃣ Produtos – Ordenação por preço
Criar classe Produto (nome, preco).
Implementar Comparable<Produto>.
Ordenar por preço crescente; se empatar, nome crescente.

4️⃣ Compromissos – Agenda
Criar classe Compromisso (descricao, LocalDateTime dataHora).
Implementar Comparable<Compromisso>.
Ordenar por data/hora mais próxima primeiro.

5️⃣ Funcionários – Tempo de empresa
Criar classe Funcionario (nome, LocalDate dataContratacao).
Implementar Comparable<Funcionario>.
Ordenar por data de contratação mais antiga primeiro; se empatar, nome.

*INTERFACE DEFAULT*

1️⃣ Log padrão em serviços
Interface Servico com método default logarExecucao().
Classe ServicoEmail implementa Servico e chama o default antes de executar.

2️⃣ Validação padrão
Interface Validador com validar(String) e default validarNaoVazio(String).
Classe ValidadorEmail usa o default e valida presença de "@".

3️⃣ Cálculo com fallback
Interface Frete com default calcular(double) retornando 20.0.
Classes FretePadrao (default) e FreteGratis (override 0.0).

4️⃣ Conflito de default methods
Interfaces Auditoria e Monitoramento com default registrar().
Classe SistemaFinanceiro implementa ambas e resolve o conflito chamando os dois métodos.

5️⃣ Evolução de interface (API)
Interface Repositorio com salvar() e novo default logSalvar().
Classe RepositorioUsuario chama logSalvar() dentro de salvar().
