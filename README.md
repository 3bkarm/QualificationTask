# 🎬 Movie Review Service

A simple Java project that manages **movies, users, and reviews**.  
It demonstrates object-oriented design principles such as **encapsulation** and the **Singleton pattern**.

---

## 📂 Project Structure

- **Movie.java**  
  Represents a movie with:
  - `ID`, `title`, `genre`, `trailerURL`
  - List of `castMembers`

- **Review.java**  
  Represents a review with:
  - `ID`, `rate`, `movieID`, `userID`

- **User.java**  
  Represents a user with:
  - `ID`, `name`
  - `watchHistory` (list of watched movies)
  - `favoriteMovies` (list of favorite movies)
  - `userReviews` (reviews written by the user)

- **Service.java**  
  Singleton service that manages:
  - Movies
  - Users
  - Reviews  
  Provides methods to add, remove, and search.

---

## 🚀 Features

- **Movie Management**
  - Add, remove, and search movies
  - Maintain cast and trailer links  

- **User Management**
  - Track user watch history
  - Store favorite movies
  - Manage user reviews  

- **Review Management**
  - Add ratings and comments for movies
  - Associate reviews with both users and movies  

- **Singleton Service**
  - Centralized application service ensures only one instance runs

---
