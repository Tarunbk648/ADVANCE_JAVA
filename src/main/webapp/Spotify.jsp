<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spotify - Music for Everyone</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, Helvetica, sans-serif;
            background: #000;
            color: #fff;
            overflow: hidden;
        }

        button,
        a {
            font-family: inherit;
        }

        button {
            cursor: pointer;
        }

        /* ================= APP ================= */

        .app {
            height: 100vh;
            display: grid;
            grid-template-columns: 240px 1fr;
            grid-template-rows: 1fr 90px;
            background: #000;
        }

        /* ================= SIDEBAR ================= */

        .sidebar {
            grid-column: 1;
            grid-row: 1;
            background: #000;
            padding: 24px 12px;
            overflow-y: auto;
        }

        .logo {
            display: flex;
            align-items: center;
            gap: 10px;
            padding: 0 12px;
            margin-bottom: 28px;
        }

        .logo-circle {
            width: 32px;
            height: 32px;
            border-radius: 50%;
            background: #1ed760;
            position: relative;
        }

        .logo-circle::before,
        .logo-circle::after {
            content: "";
            position: absolute;
            width: 20px;
            height: 5px;
            border-top: 2px solid #000;
            border-radius: 50%;
            left: 6px;
        }

        .logo-circle::before {
            top: 9px;
        }

        .logo-circle::after {
            top: 14px;
        }

        .logo-text {
            font-size: 25px;
            font-weight: 700;
        }

        .nav {
            display: flex;
            flex-direction: column;
            gap: 4px;
        }

        .nav-button {
            width: 100%;
            height: 48px;
            border: none;
            border-radius: 7px;
            background: transparent;
            color: #b3b3b3;
            display: flex;
            align-items: center;
            gap: 18px;
            padding: 0 14px;
            font-size: 14px;
            font-weight: 700;
            text-align: left;
        }

        .nav-button:hover,
        .nav-button.active {
            background: #1f1f1f;
            color: #fff;
        }

        .icon {
            width: 24px;
            height: 24px;
            display: flex;
            align-items: center;
            justify-content: center;
            position: relative;
            flex-shrink: 0;
        }

        /* CSS-only icons */

        .home-icon::before {
            content: "";
            width: 15px;
            height: 13px;
            border: 2px solid currentColor;
            border-top: none;
            position: absolute;
            bottom: 3px;
        }

        .home-icon::after {
            content: "";
            width: 12px;
            height: 12px;
            border-left: 2px solid currentColor;
            border-top: 2px solid currentColor;
            transform: rotate(45deg);
            position: absolute;
            top: 3px;
        }

        .search-icon::before {
            content: "";
            width: 13px;
            height: 13px;
            border: 2px solid currentColor;
            border-radius: 50%;
            position: absolute;
            top: 2px;
            left: 2px;
        }

        .search-icon::after {
            content: "";
            width: 8px;
            height: 2px;
            background: currentColor;
            transform: rotate(45deg);
            position: absolute;
            right: 1px;
            bottom: 4px;
        }

        .library-icon::before {
            content: "";
            width: 17px;
            height: 15px;
            border: 2px solid currentColor;
            border-radius: 2px;
        }

        .library-icon::after {
            content: "";
            width: 9px;
            height: 2px;
            background: currentColor;
            position: absolute;
            box-shadow: 0 -5px 0 currentColor, 0 5px 0 currentColor;
        }

        .playlist-title {
            margin: 28px 14px 10px;
            color: #b3b3b3;
            font-size: 11px;
            font-weight: 700;
            letter-spacing: 1px;
        }

        .playlist-button {
            width: 100%;
            height: 40px;
            border: none;
            background: transparent;
            color: #b3b3b3;
            display: flex;
            align-items: center;
            gap: 18px;
            padding: 0 14px;
            border-radius: 6px;
            text-align: left;
            font-size: 14px;
        }

        .playlist-button:hover {
            color: #fff;
            background: #181818;
        }

        .plus-icon {
            font-size: 24px;
            font-weight: 300;
            width: 24px;
            text-align: center;
        }

        .heart-icon {
            width: 24px;
            font-size: 21px;
            text-align: center;
        }

        /* ================= MAIN ================= */

        .main {
            grid-column: 2;
            grid-row: 1;
            min-width: 0;
            overflow-y: auto;
            padding: 18px 28px 120px;
            background: linear-gradient(
                #242424 0px,
                #121212 260px,
                #121212 100%
            );
        }

        .topbar {
            display: flex;
            align-items: center;
            justify-content: space-between;
            margin-bottom: 28px;
        }

        .history-buttons {
            display: flex;
            gap: 8px;
        }

        .round-button {
            width: 34px;
            height: 34px;
            border: none;
            border-radius: 50%;
            background: #090909;
            color: #fff;
            font-size: 24px;
        }

        .round-button:hover {
            background: #333;
        }

        .account {
            display: flex;
            align-items: center;
            gap: 12px;
        }

        .premium-button {
            border: none;
            background: #fff;
            color: #000;
            border-radius: 22px;
            padding: 10px 18px;
            font-size: 12px;
            font-weight: 700;
        }

        .premium-button:hover {
            transform: scale(1.03);
        }

        .profile-button {
            width: 36px;
            height: 36px;
            border: none;
            border-radius: 50%;
            background: #333;
            color: #fff;
            font-weight: 700;
        }

        .profile-button:hover {
            background: #555;
        }

        .section {
            margin-bottom: 34px;
        }

        .section-header {
            display: flex;
            align-items: center;
            justify-content: space-between;
            margin-bottom: 16px;
        }

        .section-header h2 {
            font-size: 23px;
        }

        .show-all {
            border: none;
            background: transparent;
            color: #b3b3b3;
            font-size: 12px;
            font-weight: 700;
        }

        .show-all:hover {
            color: #fff;
            text-decoration: underline;
        }

        /* ================= MUSIC CARDS ================= */

        .cards {
            display: grid;
            grid-template-columns: repeat(5, minmax(130px, 1fr));
            gap: 18px;
        }

        .card {
            position: relative;
            background: #181818;
            border-radius: 8px;
            padding: 14px;
            cursor: pointer;
            transition: background 0.2s ease;
        }

        .card:hover {
            background: #282828;
        }

        .cover {
            display: block;
            width: 100%;
            aspect-ratio: 1 / 1;
            object-fit: cover;
            border-radius: 5px;
            margin-bottom: 14px;
        }

        .card h3 {
            font-size: 14px;
            margin-bottom: 7px;
            white-space: nowrap;
            overflow: hidden;
            text-overflow: ellipsis;
        }

        .card p {
            color: #b3b3b3;
            font-size: 12px;
            line-height: 1.4;
            height: 34px;
            overflow: hidden;
        }

        .card-play {
            position: absolute;
            right: 18px;
            bottom: 70px;
            width: 46px;
            height: 46px;
            border: none;
            border-radius: 50%;
            background: #1ed760;
            color: #000;
            font-size: 18px;
            opacity: 0;
            transform: translateY(8px);
            transition: 0.2s;
            box-shadow: 0 6px 12px rgba(0,0,0,.5);
        }

        .card:hover .card-play {
            opacity: 1;
            transform: translateY(0);
        }

        .card-play:hover {
            background: #35e875;
            transform: scale(1.05);
        }

        /* ================= PLAYER ================= */

        .player {
            grid-column: 1 / 3;
            grid-row: 2;
            background: #181818;
            border-top: 1px solid #282828;
            display: grid;
            grid-template-columns: 30% 40% 30%;
            align-items: center;
            padding: 10px 18px;
            z-index: 10;
        }

        .now-playing {
            display: flex;
            align-items: center;
            gap: 12px;
            min-width: 0;
        }

        .now-playing img {
            width: 56px;
            height: 56px;
            border-radius: 4px;
            object-fit: cover;
        }

        .song-details {
            min-width: 0;
        }

        .song-name {
            font-size: 13px;
            font-weight: 700;
            white-space: nowrap;
            overflow: hidden;
            text-overflow: ellipsis;
        }

        .artist-name {
            color: #b3b3b3;
            font-size: 11px;
            margin-top: 5px;
        }

        .like-button {
            border: none;
            background: transparent;
            color: #b3b3b3;
            font-size: 21px;
        }

        .like-button:hover {
            color: #1ed760;
        }

        .player-center {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 8px;
        }

        .controls {
            display: flex;
            align-items: center;
            gap: 20px;
        }

        .control-button {
            border: none;
            background: transparent;
            color: #b3b3b3;
            font-size: 16px;
        }

        .control-button:hover {
            color: #fff;
        }

        .main-play {
            width: 34px;
            height: 34px;
            border: none;
            border-radius: 50%;
            background: #fff;
            color: #000;
            font-size: 14px;
        }

        .progress-row {
            width: 100%;
            display: flex;
            align-items: center;
            gap: 8px;
            color: #b3b3b3;
            font-size: 10px;
        }

        .progress {
            flex: 1;
            height: 4px;
            background: #4d4d4d;
            border-radius: 5px;
            cursor: pointer;
        }

        .progress-fill {
            width: 35%;
            height: 100%;
            background: #fff;
            border-radius: 5px;
        }

        .progress:hover .progress-fill {
            background: #1ed760;
        }

        .volume {
            display: flex;
            justify-content: flex-end;
            align-items: center;
            gap: 10px;
        }

        .volume input {
            width: 100px;
            accent-color: #fff;
        }

        /* ================= MESSAGE ================= */

        .message {
            position: fixed;
            left: 50%;
            bottom: 105px;
            transform: translate(-50%, 20px);
            background: #fff;
            color: #000;
            padding: 11px 18px;
            border-radius: 5px;
            font-size: 13px;
            font-weight: 700;
            opacity: 0;
            pointer-events: none;
            transition: 0.2s;
            z-index: 50;
        }

        .message.show {
            opacity: 1;
            transform: translate(-50%, 0);
        }

        /* ================= RESPONSIVE ================= */

        @media (max-width: 1100px) {
            .cards {
                grid-template-columns: repeat(4, minmax(130px, 1fr));
            }
        }

        @media (max-width: 850px) {
            .app {
                grid-template-columns: 76px 1fr;
            }

            .sidebar {
                padding-left: 8px;
                padding-right: 8px;
            }

            .logo {
                justify-content: center;
                padding: 0;
            }

            .logo-text,
            .nav-button span:last-child,
            .playlist-button span:last-child,
            .playlist-title {
                display: none;
            }

            .nav-button,
            .playlist-button {
                justify-content: center;
                padding: 0;
            }

            .main {
                padding-left: 18px;
                padding-right: 18px;
            }

            .cards {
                grid-template-columns: repeat(3, minmax(120px, 1fr));
            }

            .volume {
                display: none;
            }

            .player {
                grid-template-columns: 40% 60%;
            }
        }

        @media (max-width: 600px) {
            body {
                overflow: auto;
            }

            .app {
                display: block;
                min-height: 100vh;
            }

            .sidebar {
                display: none;
            }

            .main {
                min-height: 100vh;
                padding: 16px 14px 110px;
            }

            .cards {
                grid-template-columns: repeat(2, 1fr);
                gap: 12px;
            }

            .player {
                position: fixed;
                left: 0;
                right: 0;
                bottom: 0;
                height: 82px;
                display: grid;
                grid-template-columns: 1fr 120px;
            }

            .progress-row {
                display: none;
            }
        }
    </style>
</head>

<body>

<div class="app">

    <!-- SIDEBAR -->
    <aside class="sidebar">

        <div class="logo">
            <div class="logo-circle"></div>
            <div class="logo-text">Spotify</div>
        </div>

        <nav class="nav">

            <button class="nav-button active" data-message="Home opened">
                <span class="icon home-icon"></span>
                <span>Home</span>
            </button>

            <button class="nav-button" data-message="Search opened">
                <span class="icon search-icon"></span>
                <span>Search</span>
            </button>

            <button class="nav-button" data-message="Your Library opened">
                <span class="icon library-icon"></span>
                <span>Your Library</span>
            </button>

        </nav>

        <div class="playlist-title">PLAYLISTS</div>

        <button class="playlist-button" data-message="Create Playlist clicked">
            <span class="plus-icon">+</span>
            <span>Create Playlist</span>
        </button>

        <button class="playlist-button" data-message="Liked Songs opened">
            <span class="heart-icon">&#9825;</span>
            <span>Liked Songs</span>
        </button>

        <button class="playlist-button" data-message="Chill Hits opened">
            <span class="heart-icon">C</span>
            <span>Chill Hits</span>
        </button>

        <button class="playlist-button" data-message="Workout opened">
            <span class="heart-icon">W</span>
            <span>Workout</span>
        </button>

    </aside>


    <!-- MAIN -->
    <main class="main">

        <div class="topbar">

            <div class="history-buttons">
                <button class="round-button" data-message="Back clicked">&lt;</button>
                <button class="round-button" data-message="Forward clicked">&gt;</button>
            </div>

            <div class="account">
                <button class="premium-button" data-message="Premium clicked">
                    EXPLORE PREMIUM
                </button>

                <button class="profile-button" data-message="Profile opened">
                    T
                </button>
            </div>

        </div>


        <!-- GOOD AFTERNOON -->
        <section class="section">

            <div class="section-header">
                <h2>Good afternoon</h2>
                <button class="show-all" data-message="Showing all music">
                    SHOW ALL
                </button>
            </div>

            <div class="cards">

                <article class="card"
                    data-title="Daily Mix 1"
                    data-artist="Arijit Singh, The Weeknd and more">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=600&q=85"
                        alt="Music concert">

                    <button class="card-play" aria-label="Play Daily Mix 1">
                        &#9654;
                    </button>

                    <h3>Daily Mix 1</h3>
                    <p>Arijit Singh, The Weeknd and more</p>

                </article>


                <article class="card"
                    data-title="Chill Mix"
                    data-artist="Spotify Mix">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1470229722913-7c0e2dbbafd3?auto=format&fit=crop&w=600&q=85"
                        alt="Concert lights">

                    <button class="card-play" aria-label="Play Chill Mix">
                        &#9654;
                    </button>

                    <h3>Chill Mix</h3>
                    <p>Relax and enjoy your favorite tracks</p>

                </article>


                <article class="card"
                    data-title="Discover Weekly"
                    data-artist="Spotify">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=600&q=85"
                        alt="Singer">

                    <button class="card-play" aria-label="Play Discover Weekly">
                        &#9654;
                    </button>

                    <h3>Discover Weekly</h3>
                    <p>Your weekly mixtape of fresh music</p>

                </article>


                <article class="card"
                    data-title="Release Radar"
                    data-artist="Spotify">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1521337581100-8ca9a73a5f79?auto=format&fit=crop&w=600&q=85"
                        alt="Music performance">

                    <button class="card-play" aria-label="Play Release Radar">
                        &#9654;
                    </button>

                    <h3>Release Radar</h3>
                    <p>Catch all the latest releases</p>

                </article>


                <article class="card"
                    data-title="Liked Songs"
                    data-artist="Your Library">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1492684223066-81342ee5ff30?auto=format&fit=crop&w=600&q=85"
                        alt="Music festival">

                    <button class="card-play" aria-label="Play Liked Songs">
                        &#9654;
                    </button>

                    <h3>Liked Songs</h3>
                    <p>Your favorite songs in one place</p>

                </article>

            </div>
        </section>


        <!-- MADE FOR YOU -->
        <section class="section">

            <div class="section-header">
                <h2>Made For You</h2>
                <button class="show-all" data-message="Showing all Made For You">
                    SHOW ALL
                </button>
            </div>

            <div class="cards">

                <article class="card"
                    data-title="Today's Top Hits"
                    data-artist="Spotify">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1487180144351-b8472da7d491?auto=format&fit=crop&w=600&q=85"
                        alt="Music">

                    <button class="card-play" aria-label="Play Today's Top Hits">
                        &#9654;
                    </button>

                    <h3>Today's Top Hits</h3>
                    <p>Popular songs from today's biggest artists</p>

                </article>


                <article class="card"
                    data-title="RapCaviar"
                    data-artist="Spotify">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1524368535928-5b5e00ddc76b?auto=format&fit=crop&w=600&q=85"
                        alt="Live music">

                    <button class="card-play" aria-label="Play RapCaviar">
                        &#9654;
                    </button>

                    <h3>RapCaviar</h3>
                    <p>New music from the hottest artists</p>

                </article>


                <article class="card"
                    data-title="Viva Latino"
                    data-artist="Spotify">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1501386761578-eac5c94b800a?auto=format&fit=crop&w=600&q=85"
                        alt="Festival">

                    <button class="card-play" aria-label="Play Viva Latino">
                        &#9654;
                    </button>

                    <h3>Viva Latino</h3>
                    <p>Today's top Latin hits</p>

                </article>


                <article class="card"
                    data-title="All Out 2010s"
                    data-artist="Spotify">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1516280440614-37939bbacd81?auto=format&fit=crop&w=600&q=85"
                        alt="Music stage">

                    <button class="card-play" aria-label="Play All Out 2010s">
                        &#9654;
                    </button>

                    <h3>All Out 2010s</h3>
                    <p>The biggest songs of the decade</p>

                </article>


                <article class="card"
                    data-title="Rock Classics"
                    data-artist="Spotify">

                    <img
                        class="cover"
                        src="https://images.unsplash.com/photo-1506157786151-b8491531f063?auto=format&fit=crop&w=600&q=85"
                        alt="Rock concert">

                    <button class="card-play" aria-label="Play Rock Classics">
                        &#9654;
                    </button>

                    <h3>Rock Classics</h3>
                    <p>Rock legends and timeless anthems</p>

                </article>

            </div>
        </section>

    </main>


    <!-- BOTTOM PLAYER -->
    <footer class="player">

        <div class="now-playing">

            <img
                id="nowImage"
                src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=200&q=80"
                alt="Current song">

            <div class="song-details">
                <div class="song-name" id="songName">
                    Daily Mix 1
                </div>

                <div class="artist-name" id="artistName">
                    Spotify
                </div>
            </div>

            <button class="like-button" id="likeButton">
                &#9825;
            </button>

        </div>


        <div class="player-center">

            <div class="controls">

                <button class="control-button" data-message="Shuffle clicked">
                    S
                </button>

                <button class="control-button" data-message="Previous clicked">
                    |&lt;
                </button>

                <button class="main-play" id="playButton">
                    &#9654;
                </button>

                <button class="control-button" data-message="Next clicked">
                    &gt;|
                </button>

                <button class="control-button" data-message="Repeat clicked">
                    R
                </button>

            </div>


            <div class="progress-row">

                <span>0:00</span>

                <div class="progress" id="progressBar">
                    <div class="progress-fill" id="progressFill"></div>
                </div>

                <span>3:42</span>

            </div>

        </div>


        <div class="volume">
            <span>VOL</span>
            <input
                id="volume"
                type="range"
                min="0"
                max="100"
                value="70">
        </div>

    </footer>

</div>


<div class="message" id="message"></div>


<script>

    const message = document.getElementById("message");

    let messageTimer;

    function showMessage(text) {
        message.textContent = text;
        message.classList.add("show");

        clearTimeout(messageTimer);

        messageTimer = setTimeout(function () {
            message.classList.remove("show");
        }, 1500);
    }


    /* Sidebar buttons */

    document.querySelectorAll(".nav-button").forEach(function (button) {

        button.addEventListener("click", function () {

            document.querySelectorAll(".nav-button").forEach(function (item) {
                item.classList.remove("active");
            });

            button.classList.add("active");

            showMessage(button.dataset.message);
        });

    });


    /* Playlist buttons */

    document.querySelectorAll(".playlist-button").forEach(function (button) {

        button.addEventListener("click", function () {
            showMessage(button.dataset.message);
        });

    });


    /* General clickable buttons */

    document.querySelectorAll("[data-message]").forEach(function (button) {

        if (
            !button.classList.contains("nav-button") &&
            !button.classList.contains("playlist-button")
        ) {

            button.addEventListener("click", function () {
                showMessage(button.dataset.message);
            });

        }

    });


    /* Play button */

    const playButton = document.getElementById("playButton");

    let isPlaying = false;

    playButton.addEventListener("click", function () {

        isPlaying = !isPlaying;

        if (isPlaying) {
            playButton.innerHTML = "||";
            showMessage("Music playing");
        } else {
            playButton.innerHTML = "&#9654;";
            showMessage("Music paused");
        }

    });


    /* Music cards */

    document.querySelectorAll(".card").forEach(function (card) {

        card.addEventListener("click", function () {

            const title = card.dataset.title;
            const artist = card.dataset.artist;

            document.getElementById("songName").textContent = title;
            document.getElementById("artistName").textContent = artist;

            document.getElementById("nowImage").src =
                card.querySelector(".cover").src;

            showMessage("Selected: " + title);

        });

    });


    /* Card play buttons */

    document.querySelectorAll(".card-play").forEach(function (button) {

        button.addEventListener("click", function (event) {

            event.stopPropagation();

            const card = button.closest(".card");

            document.getElementById("songName").textContent =
                card.dataset.title;

            document.getElementById("artistName").textContent =
                card.dataset.artist;

            document.getElementById("nowImage").src =
                card.querySelector(".cover").src;

            isPlaying = true;
            playButton.innerHTML = "||";

            showMessage("Playing: " + card.dataset.title);

        });

    });


    /* Like button */

    const likeButton = document.getElementById("likeButton");

    likeButton.addEventListener("click", function () {

        if (likeButton.innerHTML.trim() === "&#9825;" ||
            likeButton.textContent.trim() === "&#9825;") {

            likeButton.innerHTML = "&#9829;";
            showMessage("Added to Liked Songs");

        } else {

            likeButton.innerHTML = "&#9825;";
            showMessage("Removed from Liked Songs");

        }

    });


    /* Progress bar */

    document.getElementById("progressBar").addEventListener("click", function (event) {

        const bar = this.getBoundingClientRect();

        const percentage =
            ((event.clientX - bar.left) / bar.width) * 100;

        document.getElementById("progressFill").style.width =
            percentage + "%";

    });


    /* Volume */

    document.getElementById("volume").addEventListener("input", function () {

        showMessage("Volume: " + this.value + "%");

    });

</script>

</body>
</html>