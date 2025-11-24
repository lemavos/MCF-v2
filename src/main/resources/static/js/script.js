const endpoints = document.querySelectorAll(".endpoint");
    const apiBaseInput = document.getElementById("apiBase");
    const urlInput = document.getElementById("urlInput");
    const sendBtn = document.getElementById("sendBtn");
    const responseDiv = document.getElementById("response");

    const sidebar = document.getElementById("sidebar");
    const overlay = document.getElementById("overlay");
    const mathBtn = document.getElementById("mathBtn");

    function toggleSidebar() {
      const isClosed = sidebar.classList.contains("closed");
      sidebar.classList.toggle("closed");
      overlay.classList.toggle("active", isClosed);
      sidebar.classList.toggle("active", isClosed);
    }

    mathBtn.addEventListener("click", toggleSidebar);
    overlay.addEventListener("click", toggleSidebar);

    // Base da API
    apiBaseInput.value = localStorage.getItem("apiBase") || "http://localhost:8080";
    apiBaseInput.addEventListener("change", () => {
      localStorage.setItem("apiBase", apiBaseInput.value.trim());
    });

    // Click no endpoint
    endpoints.forEach(el => {
      el.addEventListener("click", () => {
        const base = apiBaseInput.value.trim();
        if (!base) return alert("⚠️ Please set the API base first (localhost or ngrok)");
        urlInput.value = base + el.dataset.url;
        if (window.innerWidth <= 768) toggleSidebar();
      });
    });

    // Enviar GET
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