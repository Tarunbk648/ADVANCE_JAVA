<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LearnHub - Master New Skills</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Open Sans', sans-serif;
            background: #fff;
            color: #333;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: #fff;
            box-shadow: 0 2px 10px rgba(0,0,0,0.05);
        }
        .logo {
            font-size: 32px;
            color: #6c5ce7;
            font-weight: bold;
        }
        .nav-links {
            display: flex;
            gap: 30px;
        }
        .nav-links a {
            color: #333;
            text-decoration: none;
            font-weight: 600;
            transition: color 0.3s;
        }
        .nav-links a:hover {
            color: #6c5ce7;
        }
        .hero {
            background: linear-gradient(135deg, #6c5ce7 0%, #a29bfe 100%);
            padding: 100px 50px;
            color: #fff;
            text-align: center;
        }
        .hero h1 {
            font-size: 56px;
            margin-bottom: 20px;
        }
        .hero p {
            font-size: 22px;
            margin-bottom: 40px;
            opacity: 0.95;
        }
        .cta-buttons {
            display: flex;
            gap: 20px;
            justify-content: center;
        }
        .primary-btn {
            padding: 18px 40px;
            background: #fff;
            color: #6c5ce7;
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
        .stats {
            display: flex;
            justify-content: space-around;
            padding: 60px 50px;
            background: #f8f9fa;
        }
        .stat-item {
            text-align: center;
        }
        .stat-number {
            font-size: 48px;
            font-weight: bold;
            color: #6c5ce7;
        }
        .stat-label {
            font-size: 18px;
            color: #666;
            margin-top: 10px;
        }
        .courses {
            padding: 80px 50px;
            max-width: 1400px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 42px;
            color: #333;
            margin-bottom: 50px;
        }
        .course-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(320px, 1fr));
            gap: 30px;
        }
        .course-card {
            background: #fff;
            border-radius: 15px;
            overflow: hidden;
            box-shadow: 0 5px 20px rgba(0,0,0,0.1);
            transition: transform 0.3s;
        }
        .course-card:hover {
            transform: translateY(-10px);
        }
        .course-image {
            height: 180px;
            background: linear-gradient(135deg, #6c5ce7, #a29bfe);
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 64px;
        }
        .course-content {
            padding: 25px;
        }
        .course-category {
            background: #6c5ce7;
            color: #fff;
            padding: 5px 15px;
            border-radius: 15px;
            font-size: 12px;
            display: inline-block;
            margin-bottom: 15px;
        }
        .course-card h3 {
            font-size: 22px;
            margin-bottom: 10px;
        }
        .course-meta {
            display: flex;
            gap: 15px;
            color: #666;
            font-size: 14px;
            margin-bottom: 15px;
        }
        .course-card .instructor {
            display: flex;
            align-items: center;
            gap: 10px;
            margin-bottom: 15px;
        }
        .instructor-avatar {
            width: 40px;
            height: 40px;
            background: #ddd;
            border-radius: 50%;
        }
        .course-footer {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding-top: 15px;
            border-top: 1px solid #eee;
        }
        .course-price {
            font-size: 24px;
            font-weight: bold;
            color: #6c5ce7;
        }
        .enroll-btn {
            padding: 10px 25px;
            background: #6c5ce7;
            border: none;
            border-radius: 20px;
            color: #fff;
            cursor: pointer;
        }
        .testimonials {
            background: #f8f9fa;
            padding: 80px 50px;
        }
        .testimonial-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 30px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .testimonial-card {
            background: #fff;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.05);
        }
        .testimonial-text {
            font-style: italic;
            color: #555;
            margin-bottom: 20px;
            line-height: 1.6;
        }
        .testimonial-author {
            display: flex;
            align-items: center;
            gap: 15px;
        }
        .author-avatar {
            width: 50px;
            height: 50px;
            background: #6c5ce7;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            color: #fff;
            font-weight: bold;
        }
        .footer {
            background: #333;
            padding: 40px 50px;
            text-align: center;
            color: #fff;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">LearnHub</div>
        <div class="nav-links">
            <a href="#courses">Courses</a>
            <a href="#instructors">Instructors</a>
            <a href="#pricing">Pricing</a>
            <a href="#about">About</a>
        </div>
    </nav>

    <section class="hero">
        <h1>Learn Without Limits</h1>
        <p>Master new skills with expert-led courses in programming, design, business, and more</p>
        <div class="cta-buttons">
            <button class="primary-btn">Browse Courses</button>
            <button class="secondary-btn">Start Free Trial</button>
        </div>
    </section>

    <section class="stats">
        <div class="stat-item">
            <div class="stat-number">50K+</div>
            <div class="stat-label">Students</div>
        </div>
        <div class="stat-item">
            <div class="stat-number">200+</div>
            <div class="stat-label">Courses</div>
        </div>
        <div class="stat-item">
            <div class="stat-number">50+</div>
            <div class="stat-label">Instructors</div>
        </div>
        <div class="stat-item">
            <div class="stat-number">95%</div>
            <div class="stat-label">Success Rate</div>
        </div>
    </section>

    <section class="courses" id="courses">
        <h2 class="section-title">Popular Courses</h2>
        <div class="course-grid">
            <div class="course-card">
                <div class="course-image">💻</div>
                <div class="course-content">
                    <span class="course-category">Programming</span>
                    <h3>Complete Web Development Bootcamp</h3>
                    <div class="course-meta">
                        <span>⏱ 42 hours</span>
                        <span>📚 156 lessons</span>
                    </div>
                    <div class="instructor">
                        <div class="instructor-avatar"></div>
                        <span>Dr. Sarah Chen</span>
                    </div>
                    <div class="course-footer">
                        <div class="course-price">$99</div>
                        <button class="enroll-btn">Enroll</button>
                    </div>
                </div>
            </div>
            <div class="course-card">
                <div class="course-image">🎨</div>
                <div class="course-content">
                    <span class="course-category">Design</span>
                    <h3>UI/UX Design Masterclass</h3>
                    <div class="course-meta">
                        <span>⏱ 28 hours</span>
                        <span>📚 98 lessons</span>
                    </div>
                    <div class="instructor">
                        <div class="instructor-avatar"></div>
                        <span>Michael Torres</span>
                    </div>
                    <div class="course-footer">
                        <div class="course-price">$79</div>
                        <button class="enroll-btn">Enroll</button>
                    </div>
                </div>
            </div>
            <div class="course-card">
                <div class="course-image">📊</div>
                <div class="course-content">
                    <span class="course-category">Business</span>
                    <h3>Digital Marketing Strategy</h3>
                    <div class="course-meta">
                        <span>⏱ 35 hours</span>
                        <span>📚 112 lessons</span>
                    </div>
                    <div class="instructor">
                        <div class="instructor-avatar"></div>
                        <span>Emma Williams</span>
                    </div>
                    <div class="course-footer">
                        <div class="course-price">$89</div>
                        <button class="enroll-btn">Enroll</button>
                    </div>
                </div>
            </div>
            <div class="course-card">
                <div class="course-image">🤖</div>
                <div class="course-content">
                    <span class="course-category">AI & ML</span>
                    <h3>Machine Learning Fundamentals</h3>
                    <div class="course-meta">
                        <span>⏱ 45 hours</span>
                        <span>📚 180 lessons</span>
                    </div>
                    <div class="instructor">
                        <div class="instructor-avatar"></div>
                        <span>Prof. James Park</span>
                    </div>
                    <div class="course-footer">
                        <div class="course-price">$129</div>
                        <button class="enroll-btn">Enroll</button>
                    </div>
                </div>
            </div>
            <div class="course-card">
                <div class="course-image">📱</div>
                <div class="course-content">
                    <span class="course-category">Mobile Dev</span>
                    <h3>iOS App Development with Swift</h3>
                    <div class="course-meta">
                        <span>⏱ 38 hours</span>
                        <span>📚 145 lessons</span>
                    </div>
                    <div class="instructor">
                        <div class="instructor-avatar"></div>
                        <span>Alex Johnson</span>
                    </div>
                    <div class="course-footer">
                        <div class="course-price">$109</div>
                        <button class="enroll-btn">Enroll</button>
                    </div>
                </div>
            </div>
            <div class="course-card">
                <div class="course-image">🔒</div>
                <div class="course-content">
                    <span class="course-category">Cybersecurity</span>
                    <h3>Ethical Hacking & Security</h3>
                    <div class="course-meta">
                        <span>⏱ 50 hours</span>
                        <span>📚 200 lessons</span>
                    </div>
                    <div class="instructor">
                        <div class="instructor-avatar"></div>
                        <span>David Kim</span>
                    </div>
                    <div class="course-footer">
                        <div class="course-price">$119</div>
                        <button class="enroll-btn">Enroll</button>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="testimonials">
        <h2 class="section-title">What Our Students Say</h2>
        <div class="testimonial-grid">
            <div class="testimonial-card">
                <p class="testimonial-text">"LearnHub transformed my career. The courses are comprehensive and the instructors are incredibly knowledgeable. I landed my dream job within 3 months!"</p>
                <div class="testimonial-author">
                    <div class="author-avatar">JD</div>
                    <div>
                        <strong>Jennifer Davis</strong><br>
                        <small>Software Engineer at Google</small>
                    </div>
                </div>
            </div>
            <div class="testimonial-card">
                <p class="testimonial-text">"The flexibility to learn at my own pace while working full-time was exactly what I needed. The practical projects helped me build a strong portfolio."</p>
                <div class="testimonial-author">
                    <div class="author-avatar">RM</div>
                    <div>
                        <strong>Robert Martinez</strong><br>
                        <small>UX Designer at Apple</small>
                    </div>
                </div>
            </div>
            <div class="testimonial-card">
                <p class="testimonial-text">"Best investment I've made in my education. The community support and mentorship made all the difference in my learning journey."</p>
                <div class="testimonial-author">
                    <div class="author-avatar">LP</div>
                    <div>
                        <strong>Lisa Park</strong><br>
                        <small>Data Scientist at Amazon</small>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 LearnHub. Empowering learners worldwide.</p>
    </footer>
</body>
</html>
