# Conhece classes abstratas?
## - O que é verdade sobre classes abstratas? Selecione todas as afirmações verdadeiras
-- Podem ter atributos:
-Correto, podemos sim ter atributos! Uma classes abstrata é uma classe normal, só não pode instanciar e pode ter métodos abstratos. O resto continua valendo!

-- Podem ter métodos concretos (com implementação):
- Correto, como podem ter atributos também podem ter métodos concretos!

-- Podem ter métodos abstratos (sem implementação):
- Correto, como vimos uma classe abstrata pode ter métodos sem implementação. Dessa forma obrigamos um filho implementar o método.

-- Não podem ser instanciada:
- Correto, pois o que é abstrato (a classe) não pode se tornar concreto (objeto). Por isso não podemos instanciar objetos de uma classe abstrata.

# Revisando conceitos de herança
## Como vimos durante o curso e revisamos durante este capítulo, quais das afirmativas abaixo descreve uma vantagem do uso de herança?
-- A herança possui baixo acoplamento, logo é fácil mudar uma classe mãe sem causar problemas nas classes filhas.
- Errado, e justamente contrário. Há um acoplamento forte entre mãe e filho, por isso é preciso ter muito cautela na hora de usar a herança.

-- A herança captura o que é comum e isola aquilo que é diferente entre classes.
- Correto

-- A herança apenas serve para definir um contrato entre classes.
- Errado! Na verdade a "criação de contratos" é feita pelas interfaces.

# Revisando conceitos de interface
## Como vimos durante o curso e revisamos durante este capítulo, quais das afirmativas abaixo descreve uma vantagem do uso de interfaces?
-- Permite atributos e com isso melhora a legibilidade do código.
- Errado! Interfaces não podem possuir atributos.

-- Garante que todos os métodos de classes que implementam uma interface possam ser chamados com segurança.
- Correto! Isso é a ideia do contrato, garantindo que a classe tenha um comportamento, basta assinar o contrato (implementar a inteface).

-- Ao serem estendidas, geram um contrato entre a interface e a classe que chamou.
- Errado. Na verdade interfaces são implementadas, não estendidas.

# Composição x Herança
## Qual das afirmativas a seguir representa uma vantagem do uso de composição e interfaces sobre o uso de herança?

-- Não há vantagem alguma pode escolher o que você julga melhor.
- Errado! Na verdade existem algumas vantagens. Normalmente o uso de interfaces (para definir o contrato e ter polimorfismo) e composição (para ter reutilização de código) é mais flexível comparado a herança.

-- Com composições e interfaces teremos mais flexibilidade com nosso código, já que não nos prenderemos ao acoplamento que a herança propõe.
- Correto

-- A herança é limitada ao polimorfismo, enquanto o uso de interfaces com composição possibilita polimorfismo E reutilização de código.
- Errado pois Herança possibilita sim polimorfismo E reutilização. Com interfaces temos uma alternativa ao polimorfismo, com a composição temos uma alternativa a reutilização de código.

### De que maneira as exceptions podem ajudar a melhorar o código de seu programa?

a - Exceções tem um nome e, caso esse nome seja expressivo, documenta o problema que está ocorrendo.
b - Exceções podem ter uma mensagem, ou seja, o problema e o estado das variáveis podem ser descritos na mensagem.
c - Exceções mudam o fluxo de execução, ou seja, evitam que o problema siga o fluxo "normal" quando algo excepcional acontece.
d - Exceções podem ser tratadas, ou seja, podemos voltar para a execução "normal" caso o "problema" esteja resolvido.
-- Todas as opções representam uma forma de melhorar o código, principalmente a expressividade.

###  Vimos agora que em um arquivo de classe ou interface existe a declaração do package, a declaração do import e a definição da classe.

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
|--------------------------------------| 
| public                               | Visivel em todo lugar, dentro e fora do pacote.
| protected                            | Visível dentro do pacote e publico para os filhos (extends)
| <<package private>>                  | Visibilidade dada quando nao ha nada na frente do metodo, visivel só para o pacote
| private                              | Visivel apenas dentro da classe

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

Classe   Package   Classe Filho   Qualquer Package
────────────────────────────────────────────
 ✔        ✔         ✔             ✘
────────────────────────────────────────────

-- protected
-- Correto! O modificador protected funciona igual ao *<<package private>> mas adiciona a visibilidade para os filhos (chamado de "publico para os filhos").

# E agora, qual modificador é visível nos seguintes lugares?

Classe   Package   Classe Filho   Qq Package
────────────────────────────────────────────
 ✔        ✔         ✘             ✘
────────────────────────────────────────────

-- <<package private>> (ausência do modificador)
A ausência do modificador, também chamado de package private ou default, o membro fica visível na classe e no package, mas é invisível fora do pacote (nem para filhos).

# Javadoc

-- Qual comentário devemos usar para declarar um javadoc no código fonte?
* javadoc aqui
Correto, importante é usar o char / seguidos por 2 chars **

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
###### MAVEN ######

Apache Maven
Apache Maven é uma ferramenta de gerenciamento e compreensão de projetos de software. Com base no conceito de modelo de objeto de projeto (POM), o Maven pode gerenciar a construção, o relatório e a documentação de um projeto a partir de uma informação central.

Se você acha que o Maven pode ajudar seu projeto, você pode encontrar mais informações na seção "Sobre o Maven" da navegação. Isso inclui uma descrição detalhada do que é o Maven e uma lista de alguns de seus principais recursos .