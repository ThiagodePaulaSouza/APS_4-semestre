# Aplicação Web Java com Arduino

## 😎Apresentação:
Clique na imagem para ser redirecionado ao video em questão.
[![Aplicação Java Web com Arduino](https://github.com/ThiagodePaulaSouza/APS_4-semestre/blob/ThigasAgoraVai/imagemProjeto1.jpeg)](https://youtu.be/QZi6kXHEj2A)

## 👷‍♂️Como Rodar:

#### 1. Faça Fork do Projeto e Copie o Url:

- Abra o NetBeans IDE 8.2

- clique em equipe > Git > Clonar... 

- Insira a url do seu repositório(fork), coloque seu usuario e a senha do seu repositório e pasta para onde vai ser clonado >  próximo.

- marque a ramificação main > próximo.

- escolha o diretório > finalizar.

  

#### 2. Configure o Projeto

- Copie e cole o rxtxSerial.dll para a pasta C:\Program Files\Java\jdk1.8.0_311\bin

- Clique com o botão direito no Projeto > Propriedades > Executar > em Opções de VM:

- -Djava.library.path="C:\Program Files\Java\jdk1.8.0_311\bin"

  

#### 3. Configure o Arduino:

- [aqui](https://github.com/ThiagodePaulaSouza/APS_4-semestre/tree/main/sketch_APS)

  



## 🥳 Como Ajudar:

(recomendado que processo seja efetuado pelo git bash)



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
