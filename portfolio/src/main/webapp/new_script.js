//will return a hardcoded messafe
async function getHelloWorld() {
  const responseFromServer = await fetch('/week2');// week 2 is the servelet made earlier
  const textFromResponse = await responseFromServer.text();

  const messageContainer = document.getElementById('message-container');
  messageContainer.innerText = textFromResponse;
}