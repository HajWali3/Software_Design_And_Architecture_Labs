# High Cohesion Principle in a Social Media Application

## 1. Without High Cohesion

In this approach, the `UserProfile` class is responsible for multiple functionalities, including user data management, messaging, and notifications. This violates the Single Responsibility Principle (SRP) and results in:

- Tight Coupling: Changes in one part affect unrelated functionalities.
- Harder Testing: Testing requires handling multiple concerns at once.
- Poor Maintainability: The class grows too large and complex.

### File: `UserProfile.java`

This file demonstrates a low cohesion design where a single class handles multiple responsibilities.

---

## 2. With High Cohesion

By refactoring, i separate concerns into three classes:

- `UserProfile` – Manages user-related data only.
- `Messaging` – Handles user-to-user communication.
- `Notification` – Manages notifications separately.

This improves:

- Modularity: Each class has a clear responsibility.
- Loose Coupling: Changes in one class don’t affect others.
- Easier Maintenance & Testing: Each class can be tested independently.

### File: `SocialMediaApp.java`

This file demonstrates a high cohesion design by properly distributing responsibilities across different classes.

---

### 📌 Conclusion

Applying High Cohesion results in a more scalable, maintainable, and testable application. Keeping each class focused on a single responsibility helps in writing better-structured code.
