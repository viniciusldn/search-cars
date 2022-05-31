### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

# Requisitos do desafio


# Desafio: Acelera

Uma amiga é proprietária da Acelera, uma revendedora carros com vendas cada vez mais aquecidas. Esse sucesso começou a ser percebido por grandes empresas da cidade.
Uma dessas empresas entra em contato com sua amiga oferecendo uma parceria. A ideia da empresa é expor seus carros junto ao catálogo online da Acelera. Assim, quando uma venda for realizada pela Acelera, haverá uma comissão. Mas, para isso, essa empresa solicita o acesso aos cadastros de carros da Acelera. 

Sabendo que você é uma pessoa programadora, sua amiga procura pela sua ajuda.

Então você oferece duas opções:

1 - Entregar uma planilha excel por email, e em qualquer nova alteração de veículo será necessário enviar um novo email.
2 - Desenvolver uma API no sistema de vendas, fazendo com que a empresa parceira acesse em tempo real tanto cadastros quanto atualizações.

A segunda opção faz mais sentido, certo? Assim, você poderá fornecer sua API para vários parceiros em diferentes lugares no país. 

Vamos ao desafio!! 🚗

- Crie um projeto chamado `SellCars`

- Tudo começa com o nome do seu principal pacote br.com.trybe, que deve seguir a estrutura:
   - com.trybe.cars.controller 
   - com.trybe.cars.service
   - com.trybe.cars.model
   - com.trybe.cars.repository

- Adicione uma entidade chamada `Car`, a qual terá um atributo `nome` do tipo `String` que representa o nome do carro, e um atributo `id` do tipo `Long` que representa seu identificador (PK da Tabela), adicione no pacote (br.com.trybe.model).

- Crie uma Controller chamada `CarsController` do tipo @Controller com um método do tipo GET getAllCars() e que tenha seu Path principal /cars que irá buscar todos os Carros, adicione no pacote (br.com.trybe.controller).

- Crie um Service chamado `CarsService` do tipo @Service com um método do getAllCars() que faz chamada para sua classe Repository, adicione no pacote (br.com.trybe.service).

- Crie uma interface Repository chamada `CarsRepository` do tipo @Repository que extende JpaRepository, adicione no pacote (br.com.trybe.repository).

- Configure seu application.properties para conectar ao banco MySQL e sua base de carros. 

- Acesse o endpoint http://localhost:8080/cars para buscar todos carros.

## Exemplo

1 - Configuração de banco de dados

`spring.datasource.url=jdbc:mysql://localhost:3306/carros`
`spring.datasource.username=dbuser`
`spring.datasource.password=dbpass`
`spring.datasource.driver-class-name=com.mysql.jdbc.Driver`
`spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect`


1 - Entidade 

```java
@Entity
@Table(name = "car", schema = "public")
public class Car {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;

	//Gets and Setts
}
```

2 - Controller 

```java
@RestController
@RequestMapping("/cars")
public class CarsController {

	@Autowired
	private CarsService service;

	@GetMapping
	public ResponseEntity<List<Car>> getAllCars(){

		List<Car> p = service.getAllCars();
	
		return ResponseEntity.ok().body(p);
	}
}
```

2 - Service 

```java

@Service
public class CarsService {

	@Autowired
	private CarsRepository repository;

	public List<Car> getAllCars() {
		return repository.findAll();
	}
}
```

2 - Repository 

```java
@Repository
public interface CarsRepository extends JpaRepository<Car, Long>{

}
```

# Rodando projeto Exemplo

1 - Baixe o projeto e importe para sua IDE de preferência
2 - Rode o comando mvn install 
3 - Rode o comando mvn spring-boot:run

---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---
