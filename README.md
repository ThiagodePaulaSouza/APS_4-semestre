## 🧐 Muito bom dia, Ladies and Gentlemen



## 👷‍♂️Como Rodar:

Faça Fork do projeto e copie o url:

![](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/488fc9b6-184d-4de8-a005-7fa5e4d097b0/passo1.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210921%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210921T193942Z&X-Amz-Expires=86400&X-Amz-Signature=654e28b5807322d82712215cdc8b709c918a57d449a7d6544003cfe777355a74&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22passo1.PNG.png%22)

Entre no netbeans > clique em equipe > Git > Clonar... > Insira a url do seu repositório, a senha do seu repositório, pasta para onde vai ser clonado >  próximo > marque a ramificação > próximo > escolha o diretório > finalizar.

![](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/8dcb2e81-092d-4ec5-a050-ed02a41fc7c8/passo2.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210921%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210921T194000Z&X-Amz-Expires=86400&X-Amz-Signature=4cb9df5ffb3d380265d7a7c22272407f92a5169f3bd1f0d995c4aa4220877a4d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22passo2.png%22)





## 🥳 Como Ajudar:

(recomendado que seja pelo git bash)



##### 1. ANTES DE QUALQUER ALTERAÇÃO:

Entre dentro da pasta onde está o projeto > clique com o botão direito > git bash

``````bash
# Configure o git
# remover ()

git remote add origin (urlDoSeuRepositório)			# adiciona o repositório
git pull origin										# 'atualiza' seu repositório
git checkout -b (suaBranch)							# adiciona e muda sua branch atual

``````



##### 2. DEPOIS DE FAZER ALTERAÇÕES:

Entre dentro da pasta onde está o projeto > clique com o botão direito > git bash

``````bash
# Depois de fazer alterações
# remover ()

git status											# conferir alterações
git add (oArquivoAlterado)							# adiciona ao staged
git commit -m ("a Mensagem Do que foi feito")		# adiciona ao commited
git push -u origin (suaBranch)						# envia para o repositório remoto
``````



##### 3. CASO PEÇA O LOGIN DO SSH:

(1.1)Coloque seu user name > (1.2) clique em ok > entre em https://github.com/settings/tokens > (2.1)crie um token > de permissões a ele > finalize > (2.2) copie o token > (3.1) cole no campo de texto > (3.2) clique em ok.

![](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e1d1ffe4-8658-4ff4-a183-8160422d7bd2/ssh1.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210921%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210921T194042Z&X-Amz-Expires=86400&X-Amz-Signature=a056bc5e229b11baed9db15db6fb8a8b471068a909606ab187440cf62a972a2d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22ssh1.PNG.png%22)



##### 4. DEPOIS DO GIT VEM O GITHUB:

(1) clique em Compare & pull request > (2.1) adicione comentários necessários > (2.2) clique em Create pull request > comente a mudança como quiser.

![](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/097942ea-71e5-4267-8743-7b653be90e26/gihub1.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210921%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210921T194106Z&X-Amz-Expires=86400&X-Amz-Signature=0c5250c0c0e054ce0971e422358133808a7a7eb89e3f3cac92711cbf4b35f891&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22gihub1.PNG.png%22)
