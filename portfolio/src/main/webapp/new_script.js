//will return a hardcoded message from json
async function random_greeting() {
  const responseFromServer = await fetch('/week2');// week 2 is the week2Servelet.java
  const messageContainer = document.getElementById('message-container');

  const textFromResponse = await responseFromServer.json();
  messageContainer.innerText = textFromResponse[Math.floor(Math.random() * 3)];
}
