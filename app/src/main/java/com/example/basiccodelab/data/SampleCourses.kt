package com.example.basiccodelab.data

import com.example.basiccodelab.model.Course

object SampleCourses {
    val courses = listOf(
        Course(
            title = "Web Programming",
            code = "web1",
            creditHours = 5,
            description = "An introductory course covering fundamental concepts of websites, HTML,CSS & JS, and making responsive web layouts.",
            prerequisites = "computer device"
        ),
        Course(
            title = "Data Structures and Algorithms",
            code = "DSA1",
            creditHours = 7,
            description = "Study of fundamental data structures and algorithms, including arrays, linked lists, trees, graphs, and their applications.",
            prerequisites = "python"
        ),
        Course(
            title = "Database fundamental",
            code = "DB1",
            creditHours = 3,
            description = "Introduction to database design, SQL, normalization, and database management systems.",
            prerequisites = "MySQL"
        ),
        Course(
            title = "Software Engineering",
            code = "SE1",
            creditHours = 7,
            description = "Principles and practices of software development, including requirements analysis, design, implementation, and testing.",
            prerequisites = "COMPLETE PREENGINEERING"
        ),
        Course(
            title = "Mobile App Development",
            code = "MAD1",
            creditHours = 5,
            description = "Development of mobile applications using modern frameworks and tools, focusing on user interface design and platform-specific features.",
            prerequisites = "Jetpackcompose"
        )
    )
} 