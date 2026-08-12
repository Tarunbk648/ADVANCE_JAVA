<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lens & Light - Professional Photography</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Helvetica Neue', Arial, sans-serif;
            background: #000;
            color: #fff;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: rgba(0,0,0,0.5);
            position: fixed;
            width: 100%;
            top: 0;
            z-index: 1000;
        }
        .logo {
            font-size: 28px;
            font-weight: 300;
            letter-spacing: 3px;
        }
        .nav-links {
            display: flex;
            gap: 30px;
        }
        .nav-links a {
            color: #fff;
            text-decoration: none;
            font-weight: 300;
            letter-spacing: 1px;
            transition: color 0.3s;
        }
        .nav-links a:hover {
            color: #ffd700;
        }
        .hero {
            height: 100vh;
            background: linear-gradient(rgba(0,0,0,0.6), rgba(0,0,0,0.6)), url('https://images.unsplash.com/photo-1452587925148-ce544e77e70d?w=1920');
            background-size: cover;
            background-position: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        .hero h1 {
            font-size: 72px;
            font-weight: 300;
            margin-bottom: 20px;
            letter-spacing: 5px;
        }
        .hero p {
            font-size: 24px;
            font-weight: 300;
            margin-bottom: 40px;
            opacity: 0.9;
        }
        .portfolio-btn {
            padding: 18px 50px;
            background: transparent;
            border: 2px solid #fff;
            color: #fff;
            font-size: 16px;
            letter-spacing: 2px;
            cursor: pointer;
            transition: all 0.3s;
        }
        .portfolio-btn:hover {
            background: #fff;
            color: #000;
        }
        .portfolio {
            padding: 100px 50px;
            max-width: 1600px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 48px;
            font-weight: 300;
            margin-bottom: 60px;
            letter-spacing: 3px;
        }
        .gallery {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(400px, 1fr));
            gap: 20px;
        }
        .gallery-item {
            position: relative;
            height: 350px;
            overflow: hidden;
            cursor: pointer;
        }
        .gallery-item img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            transition: transform 0.5s;
        }
        .gallery-item:hover img {
            transform: scale(1.1);
        }
        .gallery-overlay {
            position: absolute;
            bottom: 0;
            left: 0;
            right: 0;
            background: linear-gradient(transparent, rgba(0,0,0,0.8));
            padding: 30px;
            transform: translateY(100%);
            transition: transform 0.3s;
        }
        .gallery-item:hover .gallery-overlay {
            transform: translateY(0);
        }
        .gallery-overlay h3 {
            font-size: 24px;
            font-weight: 300;
            margin-bottom: 5px;
        }
        .gallery-overlay p {
            font-size: 16px;
            opacity: 0.8;
        }
        .services {
            background: #111;
            padding: 100px 50px;
        }
        .services-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 50px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .service-card {
            text-align: center;
            padding: 40px;
            border: 1px solid #333;
            transition: border-color 0.3s;
        }
        .service-card:hover {
            border-color: #ffd700;
        }
        .service-icon {
            font-size: 48px;
            margin-bottom: 25px;
        }
        .service-card h3 {
            font-size: 28px;
            font-weight: 300;
            margin-bottom: 20px;
            letter-spacing: 2px;
        }
        .service-card p {
            color: #999;
            line-height: 1.8;
            font-weight: 300;
        }
        .about {
            padding: 100px 50px;
            max-width: 1000px;
            margin: 0 auto;
            text-align: center;
        }
        .about h2 {
            font-size: 48px;
            font-weight: 300;
            margin-bottom: 30px;
            letter-spacing: 3px;
        }
        .about p {
            font-size: 20px;
            line-height: 1.8;
            color: #ccc;
            font-weight: 300;
            margin-bottom: 40px;
        }
        .contact {
            background: #ffd700;
            padding: 80px 50px;
            text-align: center;
            color: #000;
        }
        .contact h2 {
            font-size: 48px;
            font-weight: 300;
            margin-bottom: 20px;
            letter-spacing: 3px;
        }
        .contact p {
            font-size: 20px;
            margin-bottom: 30px;
        }
        .contact-btn {
            padding: 18px 50px;
            background: #000;
            border: none;
            color: #ffd700;
            font-size: 16px;
            letter-spacing: 2px;
            cursor: pointer;
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
        <div class="logo">LENS & LIGHT</div>
        <div class="nav-links">
            <a href="#portfolio">Portfolio</a>
            <a href="#services">Services</a>
            <a href="#about">About</a>
            <a href="#contact">Contact</a>
        </div>
    </nav>

    <section class="hero">
        <h1>CAPTURE MOMENTS</h1>
        <p>Professional photography that tells your story</p>
        <button class="portfolio-btn">View Portfolio</button>
    </section>

    <section class="portfolio" id="portfolio">
        <h2 class="section-title">Selected Works</h2>
        <div class="gallery">
            <div class="gallery-item">
                <img src="https://images.unsplash.com/photo-1519741497674-611481863552?w=600" alt="Wedding">
                <div class="gallery-overlay">
                    <h3>Eternal Love</h3>
                    <p>Wedding Photography</p>
                </div>
            </div>
            <div class="gallery-item">
                <img src="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=600" alt="Portrait">
                <div class="gallery-overlay">
                    <h3>Soul Portraits</h3>
                    <p>Portrait Photography</p>
                </div>
            </div>
            <div class="gallery-item">
                <img src="https://images.unsplash.com/photo-1441986300917-64674bd600d8?w=600" alt="Fashion">
                <div class="gallery-overlay">
                    <h3>Urban Style</h3>
                    <p>Fashion Photography</p>
                </div>
            </div>
            <div class="gallery-item">
                <img src="https://images.unsplash.com/photo-1497366216548-37526070297c?w=600" alt="Corporate">
                <div class="gallery-overlay">
                    <h3>Business Vision</h3>
                    <p>Corporate Photography</p>
                </div>
            </div>
            <div class="gallery-item">
                <img src="https://images.unsplash.com/photo-1469474968028-56623f02e42e?w=600" alt="Nature">
                <div class="gallery-overlay">
                    <h3>Nature's Canvas</h3>
                    <p>Landscape Photography</p>
                </div>
            </div>
            <div class="gallery-item">
                <img src="https://images.unsplash.com/photo-1555212697-194d092e3b8f?w=600" alt="Product">
                <div class="gallery-overlay">
                    <h3>Product Excellence</h3>
                    <p>Commercial Photography</p>
                </div>
            </div>
        </div>
    </section>

    <section class="services" id="services">
        <h2 class="section-title">Services</h2>
        <div class="services-grid">
            <div class="service-card">
                <div class="service-icon">💒</div>
                <h3>Wedding</h3>
                <p>Capture your special day with artistic flair. From intimate ceremonies to grand celebrations, we document every precious moment.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">👤</div>
                <h3>Portrait</h3>
                <p>Professional headshots and family portraits that reveal personality and create lasting memories.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">👗</div>
                <h3>Fashion</h3>
                <p>High-fashion editorial shoots and lookbook photography that brings your brand vision to life.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🏢</div>
                <h3>Commercial</h3>
                <p>Product photography and corporate imagery that elevates your brand and drives engagement.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🏞️</div>
                <h3>Landscape</h3>
                <p>Breathtaking nature and travel photography that captures the beauty of our world.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🎬</div>
                <h3>Events</h3>
                <p>Comprehensive event coverage for conferences, parties, and special occasions.</p>
            </div>
        </div>
    </section>

    <section class="about" id="about">
        <h2>About The Artist</h2>
        <p>With over 15 years of experience behind the lens, I've dedicated my career to capturing the extraordinary in the ordinary. My approach combines technical precision with artistic vision, creating images that resonate emotionally and stand the test of time. From intimate portraits to grand landscapes, every project is an opportunity to tell a unique story through the universal language of photography.</p>
    </section>

    <section class="contact" id="contact">
        <h2>Let's Create Together</h2>
        <p>Ready to bring your vision to life? Get in touch for a consultation.</p>
        <button class="contact-btn">Contact Me</button>
    </section>

    <footer class="footer">
        <p>&copy; 2024 Lens & Light Photography. All rights reserved.</p>
    </footer>
</body>
</html>
