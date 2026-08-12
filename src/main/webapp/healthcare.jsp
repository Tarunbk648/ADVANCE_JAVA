<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MedCare Plus - Your Health, Our Priority</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f0f8ff;
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
            font-size: 32px;
            color: #0066cc;
            font-weight: bold;
            display: flex;
            align-items: center;
            gap: 10px;
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
            color: #0066cc;
        }
        .emergency-btn {
            padding: 12px 25px;
            background: #e74c3c;
            color: #fff;
            border: none;
            border-radius: 25px;
            font-weight: bold;
            cursor: pointer;
        }
        .hero {
            background: linear-gradient(135deg, #0066cc 0%, #004499 100%);
            padding: 100px 50px;
            color: #fff;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .hero-content {
            max-width: 600px;
        }
        .hero h1 {
            font-size: 56px;
            margin-bottom: 20px;
            line-height: 1.2;
        }
        .hero p {
            font-size: 20px;
            margin-bottom: 30px;
            opacity: 0.95;
        }
        .hero-buttons {
            display: flex;
            gap: 15px;
        }
        .primary-btn {
            padding: 18px 40px;
            background: #fff;
            color: #0066cc;
            border: none;
            border-radius: 30px;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
        }
        .secondary-btn {
            padding: 18px 40px;
            background: transparent;
            color: #fff;
            border: 2px solid #fff;
            border-radius: 30px;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
        }
        .hero-image {
            font-size: 150px;
        }
        .services {
            padding: 80px 50px;
            max-width: 1400px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 42px;
            color: #0066cc;
            margin-bottom: 50px;
        }
        .service-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
            gap: 30px;
        }
        .service-card {
            background: #fff;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.08);
            text-align: center;
            transition: transform 0.3s;
        }
        .service-card:hover {
            transform: translateY(-10px);
        }
        .service-icon {
            font-size: 64px;
            margin-bottom: 25px;
        }
        .service-card h3 {
            font-size: 24px;
            margin-bottom: 15px;
            color: #0066cc;
        }
        .service-card p {
            color: #666;
            line-height: 1.6;
        }
        .doctors {
            background: #fff;
            padding: 80px 50px;
        }
        .doctor-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 40px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .doctor-card {
            background: #f8f8f8;
            padding: 30px;
            border-radius: 15px;
            text-align: center;
        }
        .doctor-avatar {
            width: 120px;
            height: 120px;
            background: linear-gradient(135deg, #0066cc, #004499);
            border-radius: 50%;
            margin: 0 auto 20px;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 48px;
        }
        .doctor-card h3 {
            font-size: 24px;
            margin-bottom: 5px;
        }
        .doctor-card .specialty {
            color: #0066cc;
            font-size: 18px;
            margin-bottom: 15px;
        }
        .doctor-card p {
            color: #666;
            line-height: 1.6;
            margin-bottom: 20px;
        }
        .book-appointment {
            padding: 12px 30px;
            background: #0066cc;
            border: none;
            border-radius: 25px;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
        }
        .stats {
            background: linear-gradient(135deg, #0066cc 0%, #004499 100%);
            padding: 60px 50px;
            color: #fff;
        }
        .stats-grid {
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
            gap: 30px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .stat-item {
            text-align: center;
        }
        .stat-number {
            font-size: 56px;
            font-weight: bold;
            margin-bottom: 10px;
        }
        .stat-label {
            font-size: 20px;
            opacity: 0.9;
        }
        .testimonials {
            padding: 80px 50px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .testimonial-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
            gap: 30px;
        }
        .testimonial-card {
            background: #fff;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.08);
            border-left: 5px solid #0066cc;
        }
        .testimonial-text {
            font-style: italic;
            color: #555;
            line-height: 1.8;
            margin-bottom: 20px;
        }
        .testimonial-author {
            display: flex;
            align-items: center;
            gap: 15px;
        }
        .author-avatar {
            width: 50px;
            height: 50px;
            background: #0066cc;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            color: #fff;
            font-weight: bold;
        }
        .footer {
            background: #003366;
            padding: 40px 50px;
            text-align: center;
            color: #fff;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">🏥 MedCare Plus</div>
        <div class="nav-links">
            <a href="#services">Services</a>
            <a href="#doctors">Doctors</a>
            <a href="#about">About</a>
            <a href="#contact">Contact</a>
        </div>
        <button class="emergency-btn">🚨 Emergency</button>
    </nav>

    <section class="hero">
        <div class="hero-content">
            <h1>Your Health Is Our Top Priority</h1>
            <p>Experience world-class healthcare with our team of dedicated professionals. We're committed to providing compassionate care for you and your family.</p>
            <div class="hero-buttons">
                <button class="primary-btn">Book Appointment</button>
                <button class="secondary-btn">Our Services</button>
            </div>
        </div>
        <div class="hero-image">👨‍⚕️👩‍⚕️</div>
    </section>

    <section class="services" id="services">
        <h2 class="section-title">Our Medical Services</h2>
        <div class="service-grid">
            <div class="service-card">
                <div class="service-icon">🫀</div>
                <h3>Cardiology</h3>
                <p>Comprehensive heart care including diagnostics, treatment, and preventive cardiology services.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🧠</div>
                <h3>Neurology</h3>
                <p>Expert diagnosis and treatment of neurological disorders with advanced imaging technology.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🦴</div>
                <h3>Orthopedics</h3>
                <p>Specialized care for bones, joints, and muscles including sports medicine and surgery.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">👶</div>
                <h3>Pediatrics</h3>
                <p>Compassionate healthcare for infants, children, and adolescents in a child-friendly environment.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🔬</div>
                <h3>Laboratory</h3>
                <p>State-of-the-art diagnostic testing and pathology services with quick turnaround times.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🏥</div>
                <h3>Emergency Care</h3>
                <p>24/7 emergency services with rapid response teams and advanced life support equipment.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">👁️</div>
                <h3>Ophthalmology</h3>
                <p>Complete eye care services including vision correction, cataract surgery, and glaucoma treatment.</p>
            </div>
            <div class="service-card">
                <div class="service-icon">🦷</div>
                <h3>Dental Care</h3>
                <p>Comprehensive dental services from routine checkups to advanced cosmetic procedures.</p>
            </div>
        </div>
    </section>

    <section class="doctors" id="doctors">
        <h2 class="section-title">Meet Our Specialists</h2>
        <div class="doctor-grid">
            <div class="doctor-card">
                <div class="doctor-avatar">👨‍⚕️</div>
                <h3>Dr. James Wilson</h3>
                <div class="specialty">Cardiologist</div>
                <p>20+ years of experience in interventional cardiology. Harvard Medical School graduate.</p>
                <button class="book-appointment">Book Appointment</button>
            </div>
            <div class="doctor-card">
                <div class="doctor-avatar">👩‍⚕️</div>
                <h3>Dr. Sarah Chen</h3>
                <div class="specialty">Neurologist</div>
                <p>Specialist in stroke prevention and treatment. Published researcher in neurology.</p>
                <button class="book-appointment">Book Appointment</button>
            </div>
            <div class="doctor-card">
                <div class="doctor-avatar">👨‍⚕️</div>
                <h3>Dr. Michael Brown</h3>
                <div class="specialty">Orthopedic Surgeon</div>
                <p>Expert in joint replacement and sports medicine. Team physician for local sports teams.</p>
                <button class="book-appointment">Book Appointment</button>
            </div>
            <div class="doctor-card">
                <div class="doctor-avatar">👩‍⚕️</div>
                <h3>Dr. Emily Rodriguez</h3>
                <div class="specialty">Pediatrician</div>
                <p>Dedicated to children's health with a gentle approach. Board-certified pediatrician.</p>
                <button class="book-appointment">Book Appointment</button>
            </div>
        </div>
    </section>

    <section class="stats">
        <div class="stats-grid">
            <div class="stat-item">
                <div class="stat-number">50+</div>
                <div class="stat-label">Specialist Doctors</div>
            </div>
            <div class="stat-item">
                <div class="stat-number">25K+</div>
                <div class="stat-label">Happy Patients</div>
            </div>
            <div class="stat-item">
                <div class="stat-number">15+</div>
                <div class="stat-label">Years of Service</div>
            </div>
            <div class="stat-item">
                <div class="stat-number">24/7</div>
                <div class="stat-label">Emergency Care</div>
            </div>
        </div>
    </section>

    <section class="testimonials">
        <h2 class="section-title">Patient Stories</h2>
        <div class="testimonial-grid">
            <div class="testimonial-card">
                <p class="testimonial-text">"The care I received at MedCare Plus was exceptional. Dr. Wilson and his team went above and beyond to ensure my recovery. I'm forever grateful for their dedication and expertise."</p>
                <div class="testimonial-author">
                    <div class="author-avatar">JD</div>
                    <div>
                        <strong>John Davis</strong><br>
                        <small>Heart Surgery Patient</small>
                    </div>
                </div>
            </div>
            <div class="testimonial-card">
                <p class="testimonial-text">"As a mother, finding the right pediatrician was crucial. Dr. Rodriguez has been amazing with my children. Her patience and expertise make every visit stress-free."</p>
                <div class="testimonial-author">
                    <div class="author-avatar">MT</div>
                    <div>
                        <strong>Maria Thompson</strong><br>
                        <small>Parent of 3</small>
                    </div>
                </div>
            </div>
            <div class="testimonial-card">
                <p class="testimonial-text">"After my sports injury, Dr. Brown got me back on the field faster than expected. The rehabilitation program was comprehensive and the staff was incredibly supportive."</p>
                <div class="testimonial-author">
                    <div class="author-avatar">AJ</div>
                    <div>
                        <strong>Alex Johnson</strong><br>
                        <small>Professional Athlete</small>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 MedCare Plus. Caring for you, every step of the way.</p>
        <p style="margin-top: 10px; font-size: 14px; opacity: 0.8;">24/7 Emergency Hotline: 1-800-MED-CARE</p>
    </footer>
</body>
</html>
