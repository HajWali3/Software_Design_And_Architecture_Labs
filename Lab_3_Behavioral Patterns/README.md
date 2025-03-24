# Observer & Event Management Patterns

This repository contains two implementations of the **Observer Pattern** in Java:

1. **DynamicObserverPattern** – Implements the standard Observer Pattern with dynamic observer management.
2. **EventManagement** – Uses a publisher-subscriber model for event notifications.

---

## 1️⃣ DynamicObserverPattern

### **Overview**

This package demonstrates the **Observer Pattern**, where multiple observers subscribe to a subject and receive updates when its state changes.

### **Modifications**

✅ Added a `detach()` method in `Subject.java` to remove observers dynamically.
✅ Modified `ObserverPatternDemo.java` to:

- Attach multiple observers.
- Remove an observer dynamically.
- Ensure only active observers receive updates.

### **Usage**

1. Run `ObserverPatternDemo.java`.
2. The `Subject` notifies observers of state changes.
3. An observer is detached to verify dynamic removal.

### **Expected Output**

```
First state change: 15
Hex String: F
Octal String: 17
Binary String: 1111

Detaching OctalObserver...

Second state change: 10
Hex String: A
Binary String: 1010
```

---

## 2️⃣ EventManagement

### **Overview**

This package implements an **Event-Driven Observer Pattern**, where event listeners subscribe to specific events and respond accordingly.

### **Modifications**

✅ Implemented an `SMSSupportListener` to:

- Check SMS length before sending.
- Warn if the default message exceeds **160 characters**.
  ✅ `EventManager` notifies listeners when an event occurs.
  ✅ `Editor` class triggers notifications for **open** and **save** operations.
  ✅ Modified `Demo.java` to dynamically manage event subscriptions.

### **Usage**

1. Run `Demo.java`.
2. `Editor` notifies subscribed listeners on file operations.
3. The `SMSSupportListener` ensures valid SMS length before sending.

---

### 📌 **Conclusion**

Both implementations showcase **Observer Pattern variations**:

- `DynamicObserverPattern` dynamically manages observers.
- `EventManagement` extends the pattern to an event-based system.

🚀 **Run & modify the code to explore different observer scenarios!**
