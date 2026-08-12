<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PowerFit Gym - Transform Your Body</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Arial Black', sans-serif;
            background: #111;
            color: #fff;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: #000;
        }
        .logo {
            font-size: 36px;
            color: #ff3b3b;
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
            font-weight: bold;
            text-transform: uppercase;
            transition: color 0.3s;
        }
        .nav-links a:hover {
            color: #ff3b3b;
        }
        .hero {
            background: linear-gradient(rgba(0,0,0,0.8), rgba(0,0,0,0.8)), url('https://images.unsplash.com/photo-1534438327276-14e5300c3a48?w=1920');
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
            font-size: 80px;
            margin-bottom: 20px;
            text-transform: uppercase;
            color: #ff3b3b;
        }
        .hero p {
            font-size: 28px;
            margin-bottom: 40px;
            color: #ccc;
        }
        .join-btn {
            padding: 20px 60px;
            background: #ff3b3b;
            border: none;
            color: #fff;
            font-size: 20px;
            font-weight: bold;
            text-transform: uppercase;
            cursor: pointer;
            transition: background 0.3s, transform 0.3s;
        }
        .join-btn:hover {
            background: #ff5252;
            transform: scale(1.05);
        }
        .programs {
            padding: 80px 50px;
            max-width: 1400px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 56px;
            color: #ff3b3b;
            margin-bottom: 60px;
            text-transform: uppercase;
        }
        .program-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 30px;
        }
        .program-card {
            background: #1a1a1a;
            padding: 40px;
            border-radius: 10px;
            border-top: 5px solid #ff3b3b;
            text-align: center;
        }
        .program-icon {
            font-size: 64px;
            margin-bottom: 20px;
        }
        .program-card h3 {
            font-size: 28px;
            margin-bottom: 15px;
            text-transform: uppercase;
        }
        .program-card p {
            color: #999;
            line-height: 1.6;
        }
        .pricing {
            background: #1a1a1a;
            padding: 80px 50px;
        }
        .pricing-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 30px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .price-card {
            background: #222;
            padding: 50px;
            border-radius: 15px;
            text-align: center;
            border: 2px solid #333;
            transition: border-color 0.3s;
        }
        .price-card:hover {
            border-color: #ff3b3b;
        }
        .price-card.featured {
            border-color: #ff3b3b;
            transform: scale(1.05);
        }
        .price-card h3 {
            font-size: 32px;
            margin-bottom: 20px;
            text-transform: uppercase;
        }
        .price {
            font-size: 64px;
            color: #ff3b3b;
            font-weight: bold;
            margin-bottom: 30px;
        }
        .price span {
            font-size: 24px;
            color: #999;
        }
        .features-list {
            list-style: none;
            margin-bottom: 30px;
        }
        .features-list li {
            padding: 10px 0;
            color: #ccc;
            border-bottom: 1px solid #333;
        }
        .select-btn {
            padding: 15px 40px;
            background: #ff3b3b;
            border: none;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            width: 100%;
        }
        .footer {
            background: #000;
            padding: 40px 50px;
            text-align: center;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">PowerFit</div>
        <div class="nav-links">
            <a href="#programs">Programs</a>
            <a href="#pricing">Pricing</a>
            <a href="#trainers">Trainers</a>
            <a href="#contact">Contact</a>
        </div>
    </nav>

    <section class="hero">
        <h1>Unleash Your Potential</h1>
        <p>Train harder. Get stronger. Become the best version of yourself.</p>
        <button class="join-btn">Start Your Journey</button>
    </section>

    <section class="programs" id="programs">
        <h2 class="section-title">Our Programs</h2>
        <div class="program-grid">
            <div class="program-card">
                <div class="program-icon">💪</div>
                <h3>Strength Training</h3>
                <p>Build muscle and increase power with our comprehensive weight training programs designed for all levels.</p>
            </div>
            <div class="program-card">
                <div class="program-icon">🏃</div>
                <h3>Cardio & HIIT</h3>
                <p>Burn fat and improve endurance with high-intensity interval training and cardio sessions.</p>
            </div>
            <div class="program-card">
                <div class="program-icon">🧘</div>
                <h3>Yoga & Flexibility</h3>
                <p>Enhance mobility, reduce stress, and improve mind-body connection with expert-led yoga classes.</p>
            </div>
            <div class="program-card">
                <div class="program-icon">🥊</div>
                <h3>Boxing & MMA</h3>
                <p>Learn combat sports techniques while getting an intense full-body workout.</p>
            </div>
            <div class="program-card">
                <div class="program-icon">🏊</div>
                <h3>Aquatic Fitness</h3>
                <p>Low-impact water workouts perfect for rehabilitation and overall conditioning.</p>
            </div>
            <div class="program-card">
                <div class="program-icon">🎯</div>
                <h3>Personal Training</h3>
                <p>One-on-one sessions with certified trainers tailored to your specific goals and needs.</p>
            </div>
        </div>
    </section>

    <section class="pricing" id="pricing">
        <h2 class="section-title">Membership Plans</h2>
        <div class="pricing-grid">
            <div class="price-card">
                <h3>Basic</h3>
                <div class="price">$29<span>/month</span></div>
                <ul class="features-list">
                    <li>Gym access (off-peak)</li>
                    <li>Locker room access</li>
                    <li>Free parking</li>
                    <li>Basic equipment</li>
                </ul>
                <button class="select-btn">Choose Basic</button>
            </div>
            <div class="price-card featured">
                <h3>Premium</h3>
                <div class="price">$59<span>/month</span></div>
                <ul class="features-list">
                    <li>24/7 gym access</li>
                    <li>All group classes</li>
                    <li>Premium equipment</li>
                    <li>Sauna & steam room</li>
                    <li>Personal trainer session</li>
                </ul>
                <button class="select-btn">Choose Premium</button>
            </div>
            <div class="price-card">
                <h3>Elite</h3>
                <div class="price">$99<span>/month</span></div>
                <ul class="features-list">
                    <li>All Premium features</li>
                    <li>Unlimited PT sessions</li>
                    <li>Nutrition planning</li>
                    <li>Massage therapy</li>
                    <li>Exclusive events</li>
                </ul>
                <button class="select-btn">Choose Elite</button>
            </div>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 PowerFit Gym. No Excuses. No Limits. Just Results.</p>
    </footer>
</body>
</html>
