# Conhece classes abstratas?

## - O que é verdade sobre classes abstratas? Selecione todas as afirmações verdadeiras

-- Podem ter atributos:
-Correto, podemos sim ter atributos! Uma classes abstrata é uma classe normal, só não pode instanciar e pode ter métodos abstratos. O resto continua valendo!

-- Podem ter métodos concretos (com implementação):

-   Correto, como podem ter atributos também podem ter métodos concretos!

-- Podem ter métodos abstratos (sem implementação):

-   Correto, como vimos uma classe abstrata pode ter métodos sem implementação. Dessa forma obrigamos um filho implementar o método.

-- Não podem ser instanciada:

-   Correto, pois o que é abstrato (a classe) não pode se tornar concreto (objeto). Por isso não podemos instanciar objetos de uma classe abstrata.

# Revisando conceitos de herança

## Como vimos durante o curso e revisamos durante este capítulo, quais das afirmativas abaixo descreve uma vantagem do uso de herança?

-- A herança possui baixo acoplamento, logo é fácil mudar uma classe mãe sem causar problemas nas classes filhas.

-   Errado, e justamente contrário. Há um acoplamento forte entre mãe e filho, por isso é preciso ter muito cautela na hora de usar a herança.

-- A herança captura o que é comum e isola aquilo que é diferente entre classes.

-   Correto

-- A herança apenas serve para definir um contrato entre classes.

-   Errado! Na verdade a "criação de contratos" é feita pelas interfaces.

# Revisando conceitos de interface

## Como vimos durante o curso e revisamos durante este capítulo, quais das afirmativas abaixo descreve uma vantagem do uso de interfaces?

-- Permite atributos e com isso melhora a legibilidade do código.

-   Errado! Interfaces não podem possuir atributos.

-- Garante que todos os métodos de classes que implementam uma interface possam ser chamados com segurança.

-   Correto! Isso é a ideia do contrato, garantindo que a classe tenha um comportamento, basta assinar o contrato (implementar a inteface).

-- Ao serem estendidas, geram um contrato entre a interface e a classe que chamou.

-   Errado. Na verdade interfaces são implementadas, não estendidas.

# Composição x Herança

## Qual das afirmativas a seguir representa uma vantagem do uso de composição e interfaces sobre o uso de herança?

-- Não há vantagem alguma pode escolher o que você julga melhor.

-   Errado! Na verdade existem algumas vantagens. Normalmente o uso de interfaces (para definir o contrato e ter polimorfismo) e composição (para ter reutilização de código) é mais flexível comparado a herança.

-- Com composições e interfaces teremos mais flexibilidade com nosso código, já que não nos prenderemos ao acoplamento que a herança propõe.

-   Correto

-- A herança é limitada ao polimorfismo, enquanto o uso de interfaces com composição possibilita polimorfismo E reutilização de código.

-   Errado pois Herança possibilita sim polimorfismo E reutilização. Com interfaces temos uma alternativa ao polimorfismo, com a composição temos uma alternativa a reutilização de código.

### De que maneira as exceptions podem ajudar a melhorar o código de seu programa?

a - Exceções tem um nome e, caso esse nome seja expressivo, documenta o problema que está ocorrendo.
b - Exceções podem ter uma mensagem, ou seja, o problema e o estado das variáveis podem ser descritos na mensagem.
c - Exceções mudam o fluxo de execução, ou seja, evitam que o problema siga o fluxo "normal" quando algo excepcional acontece.
d - Exceções podem ser tratadas, ou seja, podemos voltar para a execução "normal" caso o "problema" esteja resolvido.
-- Todas as opções representam uma forma de melhorar o código, principalmente a expressividade.

### Vimos agora que em um arquivo de classe ou interface existe a declaração do package, a declaração do import e a definição da classe.

a) Só pode ter uma declaração package por arquivo
b) A declaração do import é opcional
c) É possível repetir a declaração import para importações de packages diferentes
d) A definição da classe sempre deve vir por último (após package e import)

# No desenvolvimento em Java, organizamos nossas classes em pacotes. Sobre esse tema é correto afirmar que:

-- Por organização e pela convenção adotada, precisamos seguir o domínio da empresa. Ou seja, se a empresa tem como domínio alura.com.br, os pacotes devem ser subpacotes de br.com.alura. Correto, mas existem exceções (poucas).

-- Quando um projeto utiliza pacotes, podemos usar o import de outras classes para sua utilização.
Correto! O import facilita o uso da classe pois não precisamos do Full Qualified Name.

-- O modificador default do Java restringe acesso a nível de pacote. Logo, se não for definido algum modificador, seja na classe, método, ou atributo, apenas classes do mesmo pacote podem acessar essas informações.
Correto, com default apenas classes do mesmo pacote podem acessar essas informações.

| Modificadores de Acesso/Visibilidade |
| ------------------------------------ | ---------------------------------------------------------------------------------- |
| public                               | Visivel em todo lugar, dentro e fora do pacote.                                    |
| protected                            | Visível dentro do pacote e publico para os filhos (extends)                        |
| <<package private>>                  | Visibilidade dada quando nao ha nada na frente do metodo, visivel só para o pacote |
| private                              | Visivel apenas dentro da classe                                                    |

package br.com.bytebank.banco.modelo;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

//...

# Sobre modificadores

-- Sobre os modificadores de acesso do Java é correto afirmar que:
Temos quatro modificadores: private, protected, default e public. Onde a ordem do MAIS restritivo para o MENOS restritivo é: private, default, protected e public.

# Qual modificador é visível nos seguintes lugares?

Classe Package Classe Filho Qualquer Package
────────────────────────────────────────────
✔ ✔ ✔ ✘
────────────────────────────────────────────

-- protected
-- Correto! O modificador protected funciona igual ao \*<<package private>> mas adiciona a visibilidade para os filhos (chamado de "publico para os filhos").

# E agora, qual modificador é visível nos seguintes lugares?

Classe Package Classe Filho Qq Package
────────────────────────────────────────────
✔ ✔ ✘ ✘
────────────────────────────────────────────

-- <<package private>> (ausência do modificador)
A ausência do modificador, também chamado de package private ou default, o membro fica visível na classe e no package, mas é invisível fora do pacote (nem para filhos).

# Javadoc

-- Qual comentário devemos usar para declarar um javadoc no código fonte?

-   javadoc aqui
    Correto, importante é usar o char / seguidos por 2 chars \*\*

# Sobre o javadoc

a) É preciso ter instalado o JDK para poder gerar a documentação javadoc.
b) O javadoc é uma documentação escrita pelo desenvolvedor para desenvolvedores.
d) Existem tags especias para marcar o autor ou a versão da classe.

### Para saber mais: Todas as tags

## Já vimos nessa aula algumas tags (ou anotações) do javadoc como @version ou @author. Segue a lista completa:

@author (usado na classe ou interface)
@version (usado na classe ou interface)
@param (usado no método e construtor)
@return (usado apenas no método)
@exception ou @throws (no método ou construtor)
@see
@since
@serial
@deprecated
Importante é que as tags do javadoc existem apenas para padronizar alguns dados fundamentais do seu código fonte como o autor e a versão.

Outras anotações: Nos cursos você também já viu uma anotação fora do javadoc, a anotação @Override. Essa anotação é considerada uma configuração, nesse caso interpretado pelo compilador.

As anotações vão muito além das tags javadoc e são muito mais sofisticadas e poderosas. Elas só entraram na plataforma Java a partir da versão 1.5 enquanto o javadoc está presente desde o nascimento da plataforma Java. O interessante é que as anotações foram inspirados pelas tags do javadoc.

# O que é um JAR?

# -- Falamos no vídeo que JAR significa nada mais do que Java ARchive.

# -- Que mais podemos dizer sobre o arquivo JAR? Assinale todas as afirmações corretas:

É o formato padrão do mundo Java para distribuir código compilado. Correto, qualquer biblioteca ou projeto vai usar JAR(s) para distribuir o código.

É um arquivo compactado como ZIP. Correto, é nada mais do que um arquivo ZIP, mas como a extensão .jar

# Exercício Javadoc

O Javadoc só estará disponível para instalações de JDK's e não para JRE's. Certifique-se de estar usando uma JDK.

# Mão na massa: javadoc

## 1 - Quando criamos nossas classes, nada mais justo do que adicionarmos a informação sobre o autor. Nesse sentido, vamos alterar a classe Cliente.java e nela adicionar a meta informação sobre o autor e sua versão.

-   Classe que representa um cliente no ByteBank
-   @author Nico Steppat
-   @version 0.1

public class Cliente {
/_ código omitido _/
}

Lembre-se que através do atalho /\*\* o Eclipse automaticamente adiciona a documentação com @author para você. Vale a pena se habituar com esse atalho.

## 2 - Faça a mesma coisa para a classe Conta.java.

## 3 - Sabemos que uma documentação pode ir além do nome do autor e versão, por exemplo, documentando métodos e construtores. Utilizando o atalho /\*\*, documente o construtor da classe Conta.java. O resultado da documentação deve ficar assim:

-   @param agencia
-   @param numero

public Conta(int agencia, int numero) {
/_ código omitido _/
}

O atalho /\*\* apenas adiciona a informação sobre os parâmetros do método, sendo de responsabilidade do desenvolvedor completar a documentação.

-   Construtor para inicializar o objeto Conta a partir da agencia e numero
-   @param agencia
-   @param numero

public Conta(int agencia, int numero) {
/_ código omitido _/
}

## 4 - Ainda na classe Conta.java, documente o método saca. Utilize mais uma vez o atalho /\*\*:

/\*\*

-   Valor precisa ser menor ou igual ao saldo
-   @param valor
-   @throws SaldoInsuficienteException
    _/
    public void saca(double valor) throws SaldoInsuficienteException {
    /_ código omitido \*/
    }

## 5 - Através do Quick Access, procure por Javadoc em View. Selecionando a opção, será exibida a aba "Javadoc". Experimente clicar nas classes que você acabou de documentar. Na aba "javadoc" será exibida a documentação da classe.

## 6 - Além de exibirmos a documentação clicando em cada classe documentada, podemos gerar a documentação como arquivo para ser consultado. Para isso, acesse o menu Project -> Generate Javadoc.

Na lista de projetos exibidos, não esqueça de selecionar o projeto bytebank-herdando-conta. Certifique-se que em Javadoc command esta preenchido com o caminho da ferramenta javadoc. Utilize na opção User standard docket o caminho padrão projeto já preenchido, sem qualquer alteração. Por fim, clique no botão "Finish" para gerar a documentação.

## 7 - Verifique a pasta doc gerada com a documentação. Acesse o arquivo doc/resources/index.html. Essa página é o ponto de entrada para a documentação. Passeie pelas classes documentadas verificando o resultado.

# Mão na massa: jar

Sabemos que através de jars podemos facilitar o compartilhamento do nosso código entre equipes. Chegou a hora de praticar.

## 1 - No Eclipse, clicando com o botão direto no projeto bytebank-herdado-conta, selecione a opção export. Diversas opções de exportação serão exibidas, selecione aquela dentro do grupo java e dentro dele a opção JAR File clicando em "NEXT". Vejamos o próximo passo a seguir.

## 2 - No projeto bytebank-herdado-conta, selecione apenas a pasta src. Desmarque também os arquivos .classpath e .project. Certifique-se que apenas a opção "Export generated class files and resources" esteja marcada. Em "Jar File", selecione uma pasta de fácil acesso no qual será gravado o arquivo jar que vamos criar. Clique em Finish e caso algum aviso seja exibido, ignore-os totalmente.

## 3 - Verifique a existência do arquivo jar criado.

## 4 - Para testar o arquivo jar recém criado, crie um novo projeto java chamado bytebank-biblioteca. Feche os demais projetos para que seja mais fácil focar o novo projeto.

## 5 - Com o botão direito sobre o novo projeto, escolha New -> Folder. Como nome do diretório escolha libs.

## 6 - Copie o jar exportado para dentro da pasta libs recém criada.

## 7 - Copiar o arquivo jar para dentro de um projeto não é suficiente, ele precisa estar no class path. Clique com o botão direto sobre o arquivo jar dentro da pasta libs e escolha a opção add to build path. Veja se você selecionou a opção "Package Explorer". Se estiver com a opção Navigator selecionada, não irá aparecer Build Path

## 8 - Agora que o nosso projeto enxerga o jar criado, crie a classe TesteBiblioteca no pacote br.com.alura.bytebank. Sua finalidade é importar algumas classes do jar importado:

package br.com.bytebank.banco;
package br.com.bytebank.banco.Conta;
package br.com.bytebank.banco.ContaCorrente;

public class TesteBiblioteca {
public static void main(String[] args) {
Conta c = new ContaCorrente(123, 321);
}
}
Excelente, você acaba de importar os recursos de um arquivo jar.

###### MAVEN

Java é uma plataforma de desenvolvimento completa que se destaca com sua grande quantidade de projetos open source. Para a maioria dos problemas no dia a dia do desenvolvedor já existem bibliotecas para resolver. Ou seja, se você gostaria de se conectar com um banco dados, ou trabalhar no desenvolvimento web, na área de data science, criação de serviços ou Android, já existem bibliotecas para tal, muitas vezes mais do que uma.

Aí existe a necessidade de organizar, centralizar e versionar os JARs dessa biblioteca e gerenciar as dependências entre elas. Para resolver isso, foram criadas ferramentas especificas e no mundo Java se destacou o Maven. O Maven organiza os JARs (código compilado, código fonte e documentação) em um repositório central que é publico e pode ser pesquisado:

https://mvnrepository.com/

Lá você pode ver e até baixar os JARs, mas o melhor é que a ferramenta Maven pode fazer isso para você. Se ficou interessado em aprender o Maven que ainda tem outros recursos bem legais, dá uma olhada no nosso curso especifico:

Maven: Build do zero a web

Obs: Se você é usuário Linux, o Maven é bem parecido com os gerenciadores apt ou rpm. No MacOS existe o brew com o mesmo propósito. No mundo .Net temos o nuget e a plataforma node.js usa npm. Gerenciar dependências é um problema do coitadinho do desenvolvedor, e cada sistema ou plataforma possui a sua solução.

Apache Maven
Apache Maven é uma ferramenta de gerenciamento e compreensão de projetos de software. Com base no conceito de modelo de objeto de projeto (POM), o Maven pode gerenciar a construção, o relatório e a documentação de um projeto a partir de uma informação central.

Se você acha que o Maven pode ajudar seu projeto, você pode encontrar mais informações na seção "Sobre o Maven" da navegação. Isso inclui uma descrição detalhada do que é o Maven e uma lista de alguns de seus principais recursos .

Sabemos que um código produzido por um desenvolvedor Java pode ser utilizado por outros desenvolvedores. Nesse sentido, documentar o código e facilitar seu uso por outros desenvolvedores é uma boa prática a ser seguida.

Sobre a geração de documentação, podemos usar o Javadoc, já para distribuição podemos empacotar a aplicação em um jar. Vamos começar pelo Javadoc.

# Sobre java.lang

-   O que é correto afirmar sobre o pacote java.lang? Alternativa correta
    Não precisa do import, é automaticamente importado. Correto, não é preciso colocar explicitamente o import java.lang.\*
    As classes String e System vem desse pacote.

# Exceções do java.lang

-   Quando falamos sobre exceções já vimos várias classes como Exception, RuntimeException, NullPointerException ou ArithmeticException.
    Todas essas classes vem do pacote java.lang e por isso não era preciso importá-las.
