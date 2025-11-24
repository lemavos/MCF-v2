const endpoints = document.querySelectorAll(".endpoint");
const apiBaseInput = document.getElementById("apiBase");
const urlInput = document.getElementById("urlInput");
const sendBtn = document.getElementById("sendBtn");
const responseDiv = document.getElementById("response");

const sidebar = document.getElementById("sidebar");
const overlay = document.getElementById("overlay");
const mathBtn = document.getElementById("mathBtn");
const physicBtn = document.getElementById("physicBtn");
const main = document.getElementById("main");

/* ===============================
   SIDEBAR TOGGLE
================================= */
function toggleSidebar() {
  const isClosed = !sidebar.classList.contains("active");
  sidebar.classList.toggle("active", isClosed);
  overlay.classList.toggle("active", isClosed);
  updateLayout();
}

/* Layout responsivo */
function updateLayout() {
  if (sidebar.classList.contains("active") && window.innerWidth > 768) {
    main.classList.add("shift");
  } else {
    main.classList.remove("shift");
  }
}

/* Botão Math abre sidebar */
mathBtn.addEventListener("click", toggleSidebar);

/* Botão Physics por enquanto só loga */
physicBtn.addEventListener("click", () => {
  alert("⚠️ Physics menu ainda não implementado!");
});

/* Fechar tocando no overlay */
overlay.addEventListener("click", toggleSidebar);

/* ===============================
   API BASE
================================= */
apiBaseInput.value = localStorage.getItem("apiBase") || "http://localhost:8080";

apiBaseInput.addEventListener("change", () => {
  localStorage.setItem("apiBase", apiBaseInput.value.trim());
});

/* ===============================
   CLICK NOS ENDPOINTS
================================= */
endpoints.forEach(el => {
  el.addEventListener("click", () => {
    const base = apiBaseInput.value.trim();
    if (!base) return alert("⚠️ Please set the API base first (localhost or ngrok)");

    urlInput.value = base + el.dataset.url;

    if (window.innerWidth <= 768) toggleSidebar();
  });
});

/* ===============================
   SEND GET REQUEST
================================= */
sendBtn.addEventListener("click", async () => {
  const url = urlInput.value.trim();
  if (!url) return alert("⚠️ Please enter a URL first!");

  responseDiv.innerText = "🔄 Sending request...";

  try {
    const res = await fetch(url);
    const text = await res.text();

    try {
      const json = JSON.parse(text);
      responseDiv.innerText = JSON.stringify(json, null, 4);
    } catch {
      responseDiv.innerText = text;
    }
  } catch (err) {
    responseDiv.innerText = "❌ Error: " + err.message;
  }
});