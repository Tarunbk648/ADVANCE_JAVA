<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Premier Properties - Find Your Dream Home</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Playfair Display', serif;
            background: #f8f8f8;
            color: #333;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: #fff;
            box-shadow: 0 2px 10px rgba(0,0,0,0.08);
        }
        .logo {
            font-size: 32px;
            color: #1a365d;
            font-weight: bold;
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
            color: #c9a227;
        }
        .hero {
            background: linear-gradient(rgba(26,54,93,0.8), rgba(26,54,93,0.8)), url('https://images.unsplash.com/photo-1600596542815-ffad4c1539a9?w=1920');
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
            opacity: 0.9;
        }
        .search-container {
            background: #fff;
            padding: 25px;
            border-radius: 10px;
            display: flex;
            gap: 15px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
        }
        .search-container select, .search-container input {
            padding: 15px 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
        }
        .search-container button {
            padding: 15px 40px;
            background: #c9a227;
            border: none;
            border-radius: 5px;
            color: #fff;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }
        .properties {
            padding: 80px 50px;
            max-width: 1400px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 48px;
            color: #1a365d;
            margin-bottom: 50px;
        }
        .property-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(380px, 1fr));
            gap: 40px;
        }
        .property-card {
            background: #fff;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 5px 20px rgba(0,0,0,0.1);
            transition: transform 0.3s;
        }
        .property-card:hover {
            transform: translateY(-10px);
        }
        .property-image {
            height: 280px;
            background-size: cover;
            background-position: center;
            position: relative;
        }
        .property-badge {
            position: absolute;
            top: 20px;
            left: 20px;
            background: #c9a227;
            color: #fff;
            padding: 8px 20px;
            border-radius: 5px;
            font-weight: bold;
        }
        .property-content {
            padding: 30px;
        }
        .property-price {
            font-size: 36px;
            color: #1a365d;
            font-weight: bold;
            margin-bottom: 10px;
        }
        .property-address {
            font-size: 20px;
            margin-bottom: 15px;
            color: #333;
        }
        .property-details {
            display: flex;
            gap: 20px;
            margin-bottom: 20px;
            color: #666;
        }
        .property-details span {
            display: flex;
            align-items: center;
            gap: 5px;
        }
        .property-features {
            display: flex;
            flex-wrap: wrap;
            gap: 10px;
            margin-bottom: 20px;
        }
        .feature-tag {
            background: #f0f0f0;
            padding: 5px 15px;
            border-radius: 15px;
            font-size: 14px;
        }
        .contact-agent {
            width: 100%;
            padding: 15px;
            background: #1a365d;
            border: none;
            border-radius: 5px;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
        }
        .services {
            background: #1a365d;
            padding: 80px 50px;
            color: #fff;
        }
        .services-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 40px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .service-item {
            text-align: center;
        }
        .service-icon {
            font-size: 64px;
            margin-bottom: 20px;
        }
        .service-item h3 {
            font-size: 24px;
            margin-bottom: 15px;
        }
        .service-item p {
            opacity: 0.8;
            line-height: 1.6;
        }
        .footer {
            background: #0d1b2a;
            padding: 40px 50px;
            text-align: center;
            color: #fff;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">Premier Properties</div>
        <div class="nav-links">
            <a href="#buy">Buy</a>
            <a href="#rent">Rent</a>
            <a href="#sell">Sell</a>
            <a href="#agents">Agents</a>
            <a href="#contact">Contact</a>
        </div>
    </nav>

    <section class="hero">
        <h1>Find Your Perfect Home</h1>
        <p>Discover exceptional properties in prime locations with our expert real estate services</p>
        <div class="search-container">
            <select>
                <option>Property Type</option>
                <option>House</option>
                <option>Apartment</option>
                <option>Condo</option>
                <option>Villa</option>
            </select>
            <select>
                <option>Location</option>
                <option>New York</option>
                <option>Los Angeles</option>
                <option>Miami</option>
                <option>Chicago</option>
            </select>
            <input type="text" placeholder="Price Range">
            <button>Search</button>
        </div>
    </section>

    <section class="properties" id="buy">
        <h2 class="section-title">Featured Properties</h2>
        <div class="property-grid">
            <div class="property-card">
                <div class="property-image" style="background-image: url('https://images.unsplash.com/photo-1600585154340-be6161a56a0c?w=600')">
                    <span class="property-badge">Featured</span>
                </div>
                <div class="property-content">
                    <div class="property-price">$1,250,000</div>
                    <div class="property-address">1234 Oak Street, Beverly Hills, CA</div>
                    <div class="property-details">
                        <span>🛏 4 Beds</span>
                        <span>🚿 3 Baths</span>
                        <span>📐 3,500 sqft</span>
                    </div>
                    <div class="property-features">
                        <span class="feature-tag">Pool</span>
                        <span class="feature-tag">Garage</span>
                        <span class="feature-tag">Garden</span>
                    </div>
                    <button class="contact-agent">Contact Agent</button>
                </div>
            </div>
            <div class="property-card">
                <div class="property-image" style="background-image: url('https://images.unsplash.com/photo-1600607687939-ce8a6c25118c?w=600')">
                    <span class="property-badge">New</span>
                </div>
                <div class="property-content">
                    <div class="property-price">$875,000</div>
                    <div class="property-address">5678 Palm Avenue, Miami, FL</div>
                    <div class="property-details">
                        <span>🛏 3 Beds</span>
                        <span>🚿 2 Baths</span>
                        <span>📐 2,200 sqft</span>
                    </div>
                    <div class="property-features">
                        <span class="feature-tag">Ocean View</span>
                        <span class="feature-tag">Balcony</span>
                        <span class="feature-tag">Modern</span>
                    </div>
                    <button class="contact-agent">Contact Agent</button>
                </div>
            </div>
            <div class="property-card">
                <div class="property-image" style="background-image: url('https://images.unsplash.com/photo-1600566753190-17f0baa2a6c3?w=600')"></div>
                <div class="property-content">
                    <div class="property-price">$2,100,000</div>
                    <div class="property-address">9101 Mountain Road, Aspen, CO</div>
                    <div class="property-details">
                        <span>🛏 5 Beds</span>
                        <span>🚿 4 Baths</span>
                        <span>📐 4,800 sqft</span>
                    </div>
                    <div class="property-features">
                        <span class="feature-tag">Mountain View</span>
                        <span class="feature-tag">Fireplace</span>
                        <span class="feature-tag">Wine Cellar</span>
                    </div>
                    <button class="contact-agent">Contact Agent</button>
                </div>
            </div>
            <div class="property-card">
                <div class="property-image" style="background-image: url('https://images.unsplash.com/photo-1600573472592-401b489a3cdc?w=600')">
                    <span class="property-badge">Hot</span>
                </div>
                <div class="property-content">
                    <div class="property-price">$650,000</div>
                    <div class="property-address">2468 Central Park, New York, NY</div>
                    <div class="property-details">
                        <span>🛏 2 Beds</span>
                        <span>🚿 2 Baths</span>
                        <span>📐 1,400 sqft</span>
                    </div>
                    <div class="property-features">
                        <span class="feature-tag">City View</span>
                        <span class="feature-tag">Doorman</span>
                        <span class="feature-tag">Gym</span>
                    </div>
                    <button class="contact-agent">Contact Agent</button>
                </div>
            </div>
            <div class="property-card">
                <div class="property-image" style="background-image: url('https://images.unsplash.com/photo-1600047509807-ba8f99d2cdde?w=600')"></div>
                <div class="property-content">
                    <div class="property-price">$1,450,000</div>
                    <div class="property-address">1357 Lake Drive, Seattle, WA</div>
                    <div class="property-details">
                        <span>🛏 4 Beds</span>
                        <span>🚿 3 Baths</span>
                        <span>📐 3,100 sqft</span>
                    </div>
                    <div class="property-features">
                        <span class="feature-tag">Lake View</span>
                        <span class="feature-tag">Dock</span>
                        <span class="feature-tag">Smart Home</span>
                    </div>
                    <button class="contact-agent">Contact Agent</button>
                </div>
            </div>
            <div class="property-card">
                <div class="property-image" style="background-image: url('https://images.unsplash.com/photo-1600585154526-990dced4db0d?w=600')">
                    <span class="property-badge">Luxury</span>
                </div>
                <div class="property-content">
                    <div class="property-price">$3,500,000</div>
                    <div class="property-address">7890 Estate Lane, Malibu, CA</div>
                    <div class="property-details">
                        <span>🛏 6 Beds</span>
                        <span>🚿 5 Baths</span>
                        <span>📐 6,200 sqft</span>
                    </div>
                    <div class="property-features">
                        <span class="feature-tag">Beach Access</span>
                        <span class="feature-tag">Infinity Pool</span>
                        <span class="feature-tag">Guest House</span>
                    </div>
                    <button class="contact-agent">Contact Agent</button>
                </div>
            </div>
        </div>
    </section>

    <section class="services">
        <h2 class="section-title" style="color: #fff;">Our Services</h2>
        <div class="services-grid">
            <div class="service-item">
                <div class="service-icon">🏠</div>
                <h3>Buy a Home</h3>
                <p>Find your perfect property with our extensive listings and expert guidance throughout the buying process.</p>
            </div>
            <div class="service-item">
                <div class="service-icon">🔑</div>
                <h3>Sell Your Home</h3>
                <p>Get the best value for your property with our marketing expertise and extensive buyer network.</p>
            </div>
            <div class="service-item">
                <div class="service-icon">📋</div>
                <h3>Rent Properties</h3>
                <p>Discover rental opportunities that match your lifestyle and budget with flexible lease options.</p>
            </div>
            <div class="service-item">
                <div class="service-icon">📊</div>
                <h3>Property Management</h3>
                <p>Professional management services to maximize your investment returns and minimize hassle.</p>
            </div>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 Premier Properties. Your trusted partner in real estate.</p>
    </footer>
</body>
</html>
