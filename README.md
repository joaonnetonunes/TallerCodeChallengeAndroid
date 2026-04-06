# 🚀 Taller Code Challenge

A simple Android application demonstrating a basic authentication flow using **Fragments**, **Navigation Component**, and **ViewBinding**.

---

## 📱 Features

- Login screen with input validation  
- User feedback via Toast messages  
- Navigation between screens (Login → Home)  
- Single Activity architecture with multiple Fragments  

---

## 🏗️ Architecture

The project follows a modern Android structure:

```
MainActivity
   └── NavHostFragment
         ├── LoginFragment
         └── HomeFragment
```

---

## 🔹 Tech Stack

- Kotlin  
- ViewBinding  
- Navigation Component  
- ConstraintLayout  

---

## 🔐 Login Flow

1. User enters:
   - Username  
   - Password  

2. Validation:
   - Fields must not be empty  

3. If invalid:
   - Shows message:  
     `Cannot login with empty fields`

4. If valid:
   - Navigates to the Home screen  

---

## 🧭 Navigation

Navigation is handled using `nav_graph.xml`:

```xml
<navigation ... app:startDestination="@id/loginFragment">

    <fragment
        android:id="@+id/loginFragment"
        android:name="com.example.tallercodechallenge.LoginFragment">

        <action
            android:id="@+id/action_login_to_home"
            app:destination="@id/homeFragment" />
    </fragment>

    <fragment
        android:id="@+id/homeFragment"
        android:name="com.example.tallercodechallenge.HomeFragment" />

</navigation>
```

---

## 🧠 Best Practices Applied

- Uses **ViewBinding** instead of `findViewById`  
- Clear separation of concerns (Activity vs Fragment)  
- Navigation handled via **Navigation Component** (no manual Fragment transactions)  
- Proper lifecycle handling (`onDestroyView`)  
- Basic input validation  

---

## ▶️ How to Run

1. Clone the repository  
2. Open it in Android Studio  
3. Run on an emulator or physical device  

---

## 📌 Possible Improvements

- Implement MVVM architecture (ViewModel + State)  
- Add form validation feedback (e.g., input errors)  
- Use Safe Args for type-safe navigation  
- Add UI/UX enhancements (loading states, animations)  
- Migrate to Jetpack Compose  
