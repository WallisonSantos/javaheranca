# Array de clientes

Cliente clienteNormal = new Cliente();
clienteNormal.setNome("Flavio");

Cliente clienteVip = new Cliente();
clienteVip.setNome("Romulo");

Object[] refs = new Object[5];
refs[0]  = clienteNormal;
refs[1]  = clienteVip;

- System.out.println(refs[1].getNome());

# Assumindo que o código está dentro de uma classe com método main, o código compila? E se compilar qual é a saída ?

- Não compila, por causa da linha  >  System.out.println(refs[1].getNome());

Repare que o nosso array guarda referências do tipo Object. Ao acessar alguma posição no array recebemos então uma referência do tipo Object   >   Object ref = refs[1]

Com essa referência em mãos não podemos chamar o método getNome(). Para fazer isso funcionar devemos fazer um type cast antes.

# Cast explicito e implícito

# Cast explícito e implícito
Já falamos bastante sobre o Type Cast que é nada mais do que a conversão de um tipo para outro.

# Cast implícito e explícito de primitivos
Para ser correto, já vimos o cast acontecendo antes mesmo de defini-lo. Temos dois exemplos, o primeiro do mundo de primitivos:

int numero = 3;
double valor = numero; \*\* cast implícito
Repare que colocamos um valor da variável numero (tipo int) na variável valor (tipo double), sem usar um cast explícito. Isso funciona? A resposta é sim, pois qualquer inteiro cabe dentro de um double. Por isso o compilador fica quieto e não exige um cast explicito, mas nada impede de escrever:

int numero = 3;
double valor = (double) numero; \*\* cast explícito
Agora, o contrário não funciona sem cast, uma vez que um double não cabe em um int:

double valor = 3.56;
int numero = (int) valor; \*\* cast explicito é exigido pelo compilador
Nesse caso o compilador joga todo valor fracional fora e guarda apenas o valor inteiro.

# Cast implícito e explícito de referências
Nas referências, o mesmo princípio se aplica. Se o cast sempre funciona não é necessário deixá-lo explícito, por exemplo:

ContaCorrente cc1 = new ContaCorrente(22, 33);
Conta conta = cc1; \*\* cast implicito

Aqui também poderia ser explícito, mas novamente, o compilador não exige pois qualquer ContaCorrente é uma Conta:

ContaCorrente cc1 = new ContaCorrente(22, 33);
Conta conta = (Conta) cc1; \*\* cast explícito mas desnecessário

# Cast possível e impossível

# Type cast explícito sempre funciona?
A resposta é não. O cast explicito só funciona se ele for possível, mas há casos em que o compilador sabe que um cast é impossível e aí nem compila, nem com type cast. Por exemplo:

Cliente cliente = new Cliente();
Conta conta = (Conta) cliente; \*\* impossível, não compila

Como o cliente não estende a classe Conta ou implementa uma interface do tipo Conta, é impossível esse cast funcionar, pois uma referência do tipo Conta jamais pode apontar para um objeto do tipo Cliente.

A certificação Java tem muitas dessas perguntas sobre cast possível, impossível, explícito e implícito. Se você pretende tirar essa certificação, vale a pena estudar esse assunto com muita calma.

# Qual declaração ?

????[] referencias = new ????[5];

referencias[0] = new Designer();
referencias[1] = new Gerente();

Designer designer = (Designer) referencias[0];
Gerente gerente = (Gerente) referencias[1];

# Funcionario
Correto, como os tipos Designer e Gerente são Funcionarios basta colocar:
Funcionario[] referencias = new Funcionario[5];

# Object
Correto, como o tipo consegue guardar qualquer tipo Object de referências o código compilar:
Object[] referencias = new Object[5];

# E a declaração do array:

Funcionario[] referencias = new Funcionario[5];
referencias[0] = new Designer();
???? ref = (????) referencias[0];

- Designer
Correto, como o Designer é um Funcionario o cast é possível (compila) e também rodaria normal.

- Gerente
Correto, como o Gerente é um Funcionario o cast é possível e compila (mas ao rodar daria ClassCastException).

- Object
Correto, no final todas as referências no array são do tipo Object. Usando Object o cast não precisa ser explícito, basta:
Object ref = referencias[0];

# Sobre ClassCastException

Leia as afirmações com atenção sobre a ClassCastException:

a) é do pacote java.lang
b) é uma exceção checked
c) É lançada quando o type cast falha

Todas são verdadeiras exceto:
b) Errado, justamente contrário. A ClassCastException é unchecked pois estende RuntimeException.


# Array não sabe quantas posições estão ocupadas (apenas tamanho total)

- Isso é uma grande desvantagem. Não queremos saber quantos elementos um array pode ter, mas sim quantos elementos realmente já existem no array.

# Array tem um tamanho fixo (não pode crescer dinamicamente)

- Uma vez criado, o array sempre terá o mesmo tamanho de elementos. Isso é muito ruim quando não sabemos exatamente quantos elementos precisamos guardar

# Sintaxe fora do padrão "OO Java"

- Os arrays realmente têm a sua própria sintaxe, o que dificulta a legibilidade do código.

### Array é uma estrutura considerada lenta

- Errado, alias é bem contrário, pensando no desempenho o array é a estrutura que se destaca.

https://cursos.alura.com.br/course/threads-java-1
https://cursos.alura.com.br/course/threads-java-2