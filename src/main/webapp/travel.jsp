<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wanderlust Adventures - Explore The World</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Helvetica Neue', Arial, sans-serif;
            background: #f8f9fa;
            color: #333;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: #fff;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }
        .logo {
            font-size: 28px;
            color: #2c3e50;
            font-weight: bold;
        }
        .logo span {
            color: #3498db;
        }
        .nav-links {
            display: flex;
            gap: 30px;
        }
        .nav-links a {
            color: #333;
            text-decoration: none;
            font-weight: 500;
            transition: color 0.3s;
        }
        .nav-links a:hover {
            color: #3498db;
        }
        .hero {
            background: linear-gradient(rgba(44,62,80,0.7), rgba(44,62,80,0.7)), url('https://images.unsplash.com/photo-1507525428034-b723cf961d3e?w=1920');
            background-size: cover;
            background-position: center;
            height: 85vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
            color: #fff;
        }
        .hero h1 {
            font-size: 64px;
            margin-bottom: 20px;
        }
        .hero p {
            font-size: 24px;
            margin-bottom: 40px;
            max-width: 700px;
        }
        .search-box {
            background: #fff;
            padding: 20px;
            border-radius: 50px;
            display: flex;
            gap: 15px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
        }
        .search-box input {
            padding: 15px 25px;
            border: none;
            border-radius: 25px;
            font-size: 16px;
            width: 250px;
        }
        .search-box button {
            padding: 15px 40px;
            background: #3498db;
            border: none;
            border-radius: 25px;
            color: #fff;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }
        .destinations {
            padding: 80px 50px;
            max-width: 1400px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 48px;
            color: #2c3e50;
            margin-bottom: 50px;
        }
        .destination-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
            gap: 30px;
        }
        .destination-card {
            background: #fff;
            border-radius: 15px;
            overflow: hidden;
            box-shadow: 0 5px 20px rgba(0,0,0,0.1);
            transition: transform 0.3s;
        }
        .destination-card:hover {
            transform: translateY(-10px);
        }
        .card-image {
            height: 250px;
            background-size: cover;
            background-position: center;
        }
        .card-content {
            padding: 25px;
        }
        .card-content h3 {
            font-size: 24px;
            margin-bottom: 10px;
            color: #2c3e50;
        }
        .card-content .location {
            color: #3498db;
            margin-bottom: 15px;
        }
        .card-content p {
            color: #666;
            line-height: 1.6;
            margin-bottom: 20px;
        }
        .card-footer {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .price {
            font-size: 24px;
            font-weight: bold;
            color: #e74c3c;
        }
        .book-btn {
            padding: 10px 25px;
            background: #3498db;
            border: none;
            border-radius: 20px;
            color: #fff;
            cursor: pointer;
        }
        .special-offers {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            padding: 80px 50px;
            color: #fff;
            text-align: center;
        }
        .special-offers h2 {
            font-size: 48px;
            margin-bottom: 20px;
        }
        .special-offers p {
            font-size: 20px;
            margin-bottom: 30px;
        }
        .offer-code {
            background: rgba(255,255,255,0.2);
            padding: 20px 40px;
            border-radius: 10px;
            font-size: 24px;
            font-weight: bold;
        }
        .footer {
            background: #2c3e50;
            padding: 40px 50px;
            text-align: center;
            color: #fff;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">Wanderlust<span>Adventures</span></div>
        <div class="nav-links">
            <a href="#destinations">Destinations</a>
            <a href="#offers">Special Offers</a>
            <a href="#about">About Us</a>
            <a href="#contact">Contact</a>
        </div>
    </nav>

    <section class="hero">
        <h1>Discover Your Next Adventure</h1>
        <p>Explore breathtaking destinations around the world with curated experiences tailored just for you</p>
        <div class="search-box">
            <input type="text" placeholder="Where do you want to go?">
            <input type="date" placeholder="Check-in">
            <input type="date" placeholder="Check-out">
            <button>Search</button>
        </div>
    </section>

    <section class="destinations" id="destinations">
        <h2 class="section-title">Popular Destinations</h2>
        <div class="destination-grid">
            <div class="destination-card">
                <div class="card-image" style="background-image: url('https://images.unsplash.com/photo-1493976040374-85c8e12f0c0e?w=600')"></div>
                <div class="card-content">
                    <h3>Kyoto, Japan</h3>
                    <div class="location">📍 Asia</div>
                    <p>Experience ancient temples, traditional tea ceremonies, and stunning cherry blossoms in Japan's cultural heart.</p>
                    <div class="card-footer">
                        <div class="price">$1,299</div>
                        <button class="book-btn">Book Now</button>
                    </div>
                </div>
            </div>
            <div class="destination-card">
                <div class="card-image" style="background-image: url('https://images.unsplash.com/photo-1499856871958-5b9627545d1a?w=600')"></div>
                <div class="card-content">
                    <h3>Paris, France</h3>
                    <div class="location">📍 Europe</div>
                    <p>Romance awaits in the City of Light with world-class cuisine, art museums, and iconic landmarks.</p>
                    <div class="card-footer">
                        <div class="price">$1,499</div>
                        <button class="book-btn">Book Now</button>
                    </div>
                </div>
            </div>
            <div class="destination-card">
                <div class="card-image" style="background-image: url('https://images.unsplash.com/photo-1518548419970-58e3b4079ab2?w=600')"></div>
                <div class="card-content">
                    <h3>Santorini, Greece</h3>
                    <div class="location">📍 Europe</div>
                    <p>White-washed buildings, crystal-clear waters, and unforgettable sunsets on this stunning Greek island.</p>
                    <div class="card-footer">
                        <div class="price">$1,899</div>
                        <button class="book-btn">Book Now</button>
                    </div>
                </div>
            </div>
            <div class="destination-card">
                <div class="card-image" style="background-image: url('https://images.unsplash.com/photo-1506905925346-21bda4d32df4?w=600')"></div>
                <div class="card-content">
                    <h3>Swiss Alps, Switzerland</h3>
                    <div class="location">📍 Europe</div>
                    <p>Majestic mountains, pristine lakes, and charming villages await in this alpine paradise.</p>
                    <div class="card-footer">
                        <div class="price">$2,199</div>
                        <button class="book-btn">Book Now</button>
                    </div>
                </div>
            </div>
            <div class="destination-card">
                <div class="card-image" style="background-image: url('https://images.unsplash.com/photo-1516306580123-e6e52b1b7b5f?w=600')"></div>
                <div class="card-content">
                    <h3>Bali, Indonesia</h3>
                    <div class="location">📍 Asia</div>
                    <p>Tropical paradise with lush rice terraces, ancient temples, and world-class surfing beaches.</p>
                    <div class="card-footer">
                        <div class="price">$999</div>
                        <button class="book-btn">Book Now</button>
                    </div>
                </div>
            </div>
            <div class="destination-card">
                <div class="card-image" style="background-image: url('https://images.unsplash.com/photo-1534430480872-3498386e7856?w=600')"></div>
                <div class="card-content">
                    <h3>Machu Picchu, Peru</h3>
                    <div class="location">📍 South America</div>
                    <p>Explore the ancient Incan citadel perched high in the Andes Mountains.</p>
                    <div class="card-footer">
                        <div class="price">$1,599</div>
                        <button class="book-btn">Book Now</button>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="special-offers" id="offers">
        <h2>Limited Time Offer</h2>
        <p>Get 20% off on all bookings made this month!</p>
        <div class="offer-code">Use code: WANDER20</div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 Wanderlust Adventures. Your journey begins here.</p>
    </footer>
</body>
</html>
