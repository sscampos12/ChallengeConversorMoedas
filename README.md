Conversor de Moedas - Projeto do Curso de Back-end da Alura Latam
Este projeto implementa um conversor de moedas em Java que consome a API do ExchangeRate-API (https://www.exchangerate-api.com/) para fornecer conversões em tempo real entre diferentes moedas.

Funcionalidades:

Conversão entre Real (BRL), Dólar americano (USD) e Euro (EUR).
Menu interativo para seleção das moedas e inserção do valor a ser convertido.
Consumo da API ExchangeRate-API para obtenção das taxas de câmbio em tempo real.
Tratamento de erros básico para lidar com entradas inválidas e falhas na comunicação com a API.
Arquitetura:

O projeto é dividido em três classes principais:

ConversorMoeda: Responsável por consumir a API e realizar as conversões.
Menu: Gerencia a interação com o usuário, exibindo o menu e lendo as opções.
Main: Contém o método principal que executa o programa.
Tecnologias Utilizadas:

Java
API ExchangeRate-API
Gson (para processamento de JSON)
Java Logging API (para registro de eventos)
Como Executar:

Clonar o repositório: git clone https://docs.github.com/pt
Compilar o código: javac *.java
Executar o programa: java Main
Observações:

API Key: Certifique-se de substituir SUA_API_KEY no código pela sua chave da API do ExchangeRate-API.
Dependências: Adicione a biblioteca Gson ao seu projeto.
Tratamento de erros: O código inclui tratamento básico de exceções. Para produção, recomenda-se adicionar tratamento de erros mais robusto para lidar com diferentes cenários de falha.
Escalabilidade: O código pode ser melhorado em termos de escalabilidade e organização, utilizando padrões de projeto como MVC (Model-View-Controller) e outras técnicas de design de software.
Interface gráfica: Para uma melhor experiência do usuário, considere adicionar uma interface gráfica com JavaFX, Swing ou tecnologias web (HTML, CSS, JavaScript).
Melhorias Futuras:

Adicionar suporte a mais moedas.
Implementar uma interface gráfica mais amigável.
Aprimorar o tratamento de erros.
Adicionar testes unitários.
Implementar persistência de dados para armazenar histórico de conversões.
Criar uma API REST para expor as funcionalidades do conversor.
Contribuições:

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para sugerir melhorias, correções de bugs ou novas funcionalidades.   

Autor:

Suzy Soares - Desenvolvedor Back-end

Licença:
