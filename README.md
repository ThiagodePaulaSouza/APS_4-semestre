# 🧐 Muito bom dia, Ladies and Gentlemen


## 👷‍♂️Como Rodar:

##### Faça Fork do Projeto e Copie o Url:

Entre no netbeans > clique em equipe > Git > Clonar... > Insira a url do seu repositório(fork), coloque seu usuario e a senha do seu repositório e pasta para onde vai ser clonado >  próximo > marque a ramificação main > próximo > escolha o diretório > finalizar.



##### Tendo o Arduino em Mãos:

Abra o Arduino IDE > clique em Ferramentas > Placa:"" > Selecione sua placa > Porta > Selecione sua Porta (Lembrar que caso sua porta seja diferente de COM3, será necessário alterar no Serial.java).

Clique em arquivo > abrir... > selecione a pasta \sketch_APS\sketch_sep30a > selecione o arquivo sketch_sep30a.ino > clique em Abrir.

Clique em Sketch> Incluir Biblioteca > Adicionar Biblioteca.zip > selecione a pasta \sketch_APS > selecione o arquivo DHT.zip > clique em Abrir.


## 🥳 Como Ajudar:

(recomendado que seja pelo git bash)



##### 1. ANTES DE QUALQUER ALTERAÇÃO:

Entre dentro da pasta onde está o projeto > clique com o botão direito > git bash

``````bash
# Configure o git
# remover os ()

git remote add origin (urlDoSeuRepositório)
git pull origin
git checkout -b (suaBranch)

``````


##### 2. DEPOIS DE FAZER ALTERAÇÕES:

Entre dentro da pasta onde está o projeto > clique com o botão direito > git bash

``````bash
# Depois de fazer alterações
# remover ()

git status
git add (oArquivoAlterado)
git commit -m ("a Mensagem Do que foi feito")
git push -u origin (suaBranch)
``````


##### 3. CASO PEÇA O LOGIN DO SSH:

Coloque seu user name > clique em ok > entre em https://github.com/settings/tokens > crie um token > de permissões a ele > finalize > copie o token > cole no campo de texto > clique em ok.



##### 4. DEPOIS DO GIT VEM O GITHUB:

clique em Compare & pull request > adicione comentários necessários > clique em Create pull request > comente a mudança como quiser.
