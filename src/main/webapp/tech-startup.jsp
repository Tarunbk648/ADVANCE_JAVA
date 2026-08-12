<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NovaTech - Innovate Tomorrow</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: #fff;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: rgba(0,0,0,0.2);
            backdrop-filter: blur(10px);
        }
        .logo {
            font-size: 28px;
            font-weight: bold;
            background: linear-gradient(45deg, #00d2ff, #3a7bd5);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }
        .nav-links {
            display: flex;
            gap: 30px;
        }
        .nav-links a {
            color: #fff;
            text-decoration: none;
            font-weight: 500;
            transition: color 0.3s;
        }
        .nav-links a:hover {
            color: #00d2ff;
        }
        .hero {
            text-align: center;
            padding: 100px 50px;
        }
        .hero h1 {
            font-size: 64px;
            margin-bottom: 20px;
            background: linear-gradient(45deg, #fff, #00d2ff);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }
        .hero p {
            font-size: 24px;
            margin-bottom: 40px;
            opacity: 0.9;
        }
        .cta-button {
            padding: 15px 40px;
            background: linear-gradient(45deg, #00d2ff, #3a7bd5);
            border: none;
            border-radius: 50px;
            color: #fff;
            font-size: 18px;
            cursor: pointer;
            transition: transform 0.3s, box-shadow 0.3s;
        }
        .cta-button:hover {
            transform: translateY(-3px);
            box-shadow: 0 10px 30px rgba(0,210,255,0.4);
        }
        .features {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 30px;
            padding: 80px 50px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .feature-card {
            background: rgba(255,255,255,0.1);
            padding: 40px;
            border-radius: 20px;
            backdrop-filter: blur(10px);
            transition: transform 0.3s;
        }
        .feature-card:hover {
            transform: translateY(-10px);
        }
        .feature-icon {
            font-size: 48px;
            margin-bottom: 20px;
        }
        .feature-card h3 {
            font-size: 24px;
            margin-bottom: 15px;
        }
        .stats {
            display: flex;
            justify-content: space-around;
            padding: 60px 50px;
            background: rgba(0,0,0,0.2);
        }
        .stat-item {
            text-align: center;
        }
        .stat-number {
            font-size: 48px;
            font-weight: bold;
            color: #00d2ff;
        }
        .stat-label {
            font-size: 18px;
            margin-top: 10px;
        }
        .footer {
            text-align: center;
            padding: 40px;
            background: rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">NovaTech</div>
        <div class="nav-links">
            <a href="#features">Features</a>
            <a href="#about">About</a>
            <a href="#contact">Contact</a>
        </div>
    </nav>

    <section class="hero">
        <h1>Innovate Tomorrow</h1>
        <p>Building the future with cutting-edge AI solutions and cloud infrastructure</p>
        <button class="cta-button">Get Started Free</button>
    </section>

    <section class="features" id="features">
        <div class="feature-card">
            <div class="feature-icon">🚀</div>
            <h3>Lightning Fast</h3>
            <p>Deploy in seconds with our optimized cloud infrastructure. 99.99% uptime guaranteed.</p>
        </div>
        <div class="feature-card">
            <div class="feature-icon">🤖</div>
            <h3>AI-Powered</h3>
            <p>Machine learning algorithms that adapt and evolve with your business needs.</p>
        </div>
        <div class="feature-card">
            <div class="feature-icon">🔒</div>
            <h3>Bank-Level Security</h3>
            <p>End-to-end encryption with SOC 2 Type II compliance for your peace of mind.</p>
        </div>
    </section>

    <section class="stats">
        <div class="stat-item">
            <div class="stat-number">10K+</div>
            <div class="stat-label">Active Users</div>
        </div>
        <div class="stat-item">
            <div class="stat-number">99.9%</div>
            <div class="stat-label">Uptime</div>
        </div>
        <div class="stat-item">
            <div class="stat-number">50M+</div>
            <div class="stat-label">API Calls/Day</div>
        </div>
        <div class="stat-item">
            <div class="stat-number">24/7</div>
            <div class="stat-label">Support</div>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 NovaTech Inc. All rights reserved.</p>
    </footer>
</body>
</html>
