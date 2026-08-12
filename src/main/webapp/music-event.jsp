<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SonicFest 2024 - The Ultimate Music Experience</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Impact', sans-serif;
            background: #0a0a0a;
            color: #fff;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: linear-gradient(90deg, #ff006e, #8338ec, #3a86ff);
        }
        .logo {
            font-size: 36px;
            text-transform: uppercase;
            letter-spacing: 3px;
        }
        .nav-links {
            display: flex;
            gap: 30px;
        }
        .nav-links a {
            color: #fff;
            text-decoration: none;
            font-size: 16px;
            text-transform: uppercase;
            letter-spacing: 2px;
            transition: opacity 0.3s;
        }
        .nav-links a:hover {
            opacity: 0.7;
        }
        .hero {
            background: linear-gradient(rgba(0,0,0,0.7), rgba(0,0,0,0.7)), url('https://images.unsplash.com/photo-1459749411175-04bf5292ceea?w=1920');
            background-size: cover;
            background-position: center;
            height: 90vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        .hero h1 {
            font-size: 96px;
            margin-bottom: 20px;
            background: linear-gradient(90deg, #ff006e, #8338ec, #3a86ff);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
            text-transform: uppercase;
            letter-spacing: 5px;
        }
        .hero .date {
            font-size: 32px;
            margin-bottom: 20px;
            color: #ff006e;
        }
        .hero p {
            font-size: 24px;
            margin-bottom: 40px;
            opacity: 0.9;
        }
        .ticket-btn {
            padding: 20px 60px;
            background: linear-gradient(90deg, #ff006e, #8338ec);
            border: none;
            color: #fff;
            font-size: 20px;
            font-weight: bold;
            text-transform: uppercase;
            letter-spacing: 2px;
            cursor: pointer;
            transition: transform 0.3s, box-shadow 0.3s;
        }
        .ticket-btn:hover {
            transform: scale(1.05);
            box-shadow: 0 10px 30px rgba(255,0,110,0.5);
        }
        .lineup {
            padding: 100px 50px;
            background: #111;
        }
        .section-title {
            text-align: center;
            font-size: 64px;
            margin-bottom: 60px;
            text-transform: uppercase;
            letter-spacing: 5px;
        }
        .artist-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 30px;
            max-width: 1400px;
            margin: 0 auto;
        }
        .artist-card {
            background: #1a1a1a;
            padding: 30px;
            border-radius: 10px;
            text-align: center;
            border: 2px solid transparent;
            transition: border-color 0.3s;
        }
        .artist-card:hover {
            border-color: #ff006e;
        }
        .artist-image {
            width: 150px;
            height: 150px;
            background: linear-gradient(135deg, #ff006e, #8338ec);
            border-radius: 50%;
            margin: 0 auto 20px;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 64px;
        }
        .artist-card h3 {
            font-size: 28px;
            margin-bottom: 10px;
            text-transform: uppercase;
        }
        .artist-card .genre {
            color: #8338ec;
            font-size: 18px;
            margin-bottom: 15px;
        }
        .artist-card .time {
            color: #666;
            font-size: 16px;
        }
        .schedule {
            padding: 100px 50px;
            background: #0a0a0a;
        }
        .schedule-table {
            max-width: 1000px;
            margin: 0 auto;
        }
        .schedule-row {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 25px;
            border-bottom: 1px solid #333;
            transition: background 0.3s;
        }
        .schedule-row:hover {
            background: #1a1a1a;
        }
        .schedule-time {
            font-size: 24px;
            color: #ff006e;
            width: 150px;
        }
        .schedule-artist {
            font-size: 28px;
            flex: 1;
            text-align: center;
        }
        .schedule-stage {
            color: #8338ec;
            font-size: 18px;
            width: 150px;
        }
        .tickets {
            padding: 100px 50px;
            background: linear-gradient(135deg, #111, #222);
        }
        .ticket-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
            gap: 30px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .ticket-card {
            background: #1a1a1a;
            padding: 40px;
            border-radius: 15px;
            text-align: center;
            border: 2px solid #333;
            transition: transform 0.3s, border-color 0.3s;
        }
        .ticket-card:hover {
            transform: translateY(-10px);
            border-color: #ff006e;
        }
        .ticket-card.featured {
            border-color: #ff006e;
            transform: scale(1.05);
        }
        .ticket-card h3 {
            font-size: 32px;
            margin-bottom: 20px;
            text-transform: uppercase;
        }
        .ticket-price {
            font-size: 56px;
            color: #ff006e;
            font-weight: bold;
            margin-bottom: 30px;
        }
        .ticket-features {
            list-style: none;
            margin-bottom: 30px;
            text-align: left;
        }
        .ticket-features li {
            padding: 10px 0;
            border-bottom: 1px solid #333;
            color: #ccc;
        }
        .buy-btn {
            width: 100%;
            padding: 18px;
            background: linear-gradient(90deg, #ff006e, #8338ec);
            border: none;
            color: #fff;
            font-size: 18px;
            font-weight: bold;
            text-transform: uppercase;
            cursor: pointer;
        }
        .venue {
            padding: 100px 50px;
            background: #111;
            text-align: center;
        }
        .venue h2 {
            font-size: 48px;
            margin-bottom: 30px;
            text-transform: uppercase;
        }
        .venue-info {
            font-size: 24px;
            color: #ccc;
            margin-bottom: 20px;
        }
        .venue-address {
            font-size: 20px;
            color: #8338ec;
        }
        .footer {
            background: #000;
            padding: 40px 50px;
            text-align: center;
            color: #666;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">SonicFest</div>
        <div class="nav-links">
            <a href="#lineup">Lineup</a>
            <a href="#schedule">Schedule</a>
            <a href="#tickets">Tickets</a>
            <a href="#venue">Venue</a>
        </div>
    </nav>

    <section class="hero">
        <h1>SonicFest 2024</h1>
        <div class="date">AUGUST 15-17, 2024</div>
        <p>Three days of electrifying music, unforgettable experiences, and pure energy</p>
        <button class="ticket-btn">Get Tickets Now</button>
    </section>

    <section class="lineup" id="lineup">
        <h2 class="section-title">Headliners</h2>
        <div class="artist-grid">
            <div class="artist-card">
                <div class="artist-image">🎤</div>
                <h3>Neon Pulse</h3>
                <div class="genre">Electronic / Synthwave</div>
                <div class="time">Friday 9PM</div>
            </div>
            <div class="artist-card">
                <div class="artist-image">🎸</div>
                <h3>Crimson Tide</h3>
                <div class="genre">Alternative Rock</div>
                <div class="time">Saturday 10PM</div>
            </div>
            <div class="artist-card">
                <div class="artist-image">🎹</div>
                <h3>Luna Echo</h3>
                <div class="genre">Indie Pop</div>
                <div class="time">Sunday 8PM</div>
            </div>
            <div class="artist-card">
                <div class="artist-image">🥁</div>
                <h3>Thunder Beat</h3>
                <div class="genre">Hip Hop / Trap</div>
                <div class="time">Friday 11PM</div>
            </div>
            <div class="artist-card">
                <div class="artist-image">🎻</div>
                <h3>Symphony X</h3>
                <div class="genre">Orchestral Rock</div>
                <div class="time">Saturday 8PM</div>
            </div>
            <div class="artist-card">
                <div class="artist-image">🎷</div>
                <h3>Jazz Fusion</h3>
                <div class="genre">Jazz / Funk</div>
                <div class="time">Sunday 6PM</div>
            </div>
        </div>
    </section>

    <section class="schedule" id="schedule">
        <h2 class="section-title">Schedule</h2>
        <div class="schedule-table">
            <div class="schedule-row">
                <div class="schedule-time">6:00 PM</div>
                <div class="schedule-artist">Gates Open</div>
                <div class="schedule-stage">All Stages</div>
            </div>
            <div class="schedule-row">
                <div class="schedule-time">7:00 PM</div>
                <div class="schedule-artist">Opening Acts</div>
                <div class="schedule-stage">Main Stage</div>
            </div>
            <div class="schedule-row">
                <div class="schedule-time">8:00 PM</div>
                <div class="schedule-artist">Luna Echo</div>
                <div class="schedule-stage">Main Stage</div>
            </div>
            <div class="schedule-row">
                <div class="schedule-time">9:00 PM</div>
                <div class="schedule-artist">Neon Pulse</div>
                <div class="schedule-stage">Main Stage</div>
            </div>
            <div class="schedule-row">
                <div class="schedule-time">10:00 PM</div>
                <div class="schedule-artist">Crimson Tide</div>
                <div class="schedule-stage">Main Stage</div>
            </div>
            <div class="schedule-row">
                <div class="schedule-time">11:00 PM</div>
                <div class="schedule-artist">Thunder Beat</div>
                <div class="schedule-stage">Main Stage</div>
            </div>
        </div>
    </section>

    <section class="tickets" id="tickets">
        <h2 class="section-title">Ticket Options</h2>
        <div class="ticket-grid">
            <div class="ticket-card">
                <h3>General</h3>
                <div class="ticket-price">$149</div>
                <ul class="ticket-features">
                    <li>3-Day Festival Access</li>
                    <li>All Main Stage Shows</li>
                    <li>General Admission</li>
                    <li>Basic Amenities</li>
                </ul>
                <button class="buy-btn">Buy Now</button>
            </div>
            <div class="ticket-card featured">
                <h3>VIP</h3>
                <div class="ticket-price">$299</div>
                <ul class="ticket-features">
                    <li>3-Day Festival Access</li>
                    <li>All Stage Access</li>
                    <li>VIP Viewing Areas</li>
                    <li>Exclusive Lounge</li>
                    <li>Fast Track Entry</li>
                    <li>Complimentary Drinks</li>
                </ul>
                <button class="buy-btn">Buy Now</button>
            </div>
            <div class="ticket-card">
                <h3>Ultimate</h3>
                <div class="ticket-price">$599</div>
                <ul class="ticket-features">
                    <li>All VIP Features</li>
                    <li>Backstage Access</li>
                    <li>Meet & Greet</li>
                    <li>Premium Merch Pack</li>
                    <li>Private Viewing Deck</li>
                    <li>Dedicated Concierge</li>
                </ul>
                <button class="buy-btn">Buy Now</button>
            </div>
        </div>
    </section>

    <section class="venue" id="venue">
        <h2>Venue Information</h2>
        <div class="venue-info">Grand Park Arena</div>
        <div class="venue-address">1234 Festival Boulevard, Music City, CA 90210</div>
        <p style="margin-top: 30px; color: #666;">Free parking available | Shuttle service from downtown | ADA accessible</p>
    </section>

    <footer class="footer">
        <p>&copy; 2024 SonicFest. Feel the rhythm. Live the moment.</p>
    </footer>
</body>
</html>
