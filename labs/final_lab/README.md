# SDA Final Exams

## Antique & Auction Platform

if you want to see full application

[EasyBid Complete Backend](https://github.com/KashifKhn/easybid_java_spring/)
[EasyBid Complete Frontend](https://github.com/KashifKhn/easybid_client)

## **Tech Stack**

### **Backend**:

- **Java Spring Boot**: API development.
- **PostgreSQL**: Database for users, items, and bids.

### **Deployment**:

- **Docker Compose**: For PostgreSQL database.

---

## **Development Setup**

### **Requirements**

- **Java 21+**
- **Maven**
- **Docker & Docker Compose**
- **Bruno** (optional, for API testing)

---

## **How to Run**

### **Step 1: Clone the Repository**

```bash
git clone https://github.com/KashifKhn/Software_Architecture_Design.git
cd  labs/final_lab/auction
```

---

### **Step 2: Build and Run Backend**

1. Run the docker compose for Database :
   ```bash
   docker-compose up -d
   ```
2. Build the Spring Boot application:
   ```bash
   ./mvnw clean install
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

### **Step 2: Testing**

#### **Item Endpoints**

- `POST /api/v1/items`: Create a new item.
- `GET /api/v1/items`: List all items.
- `GET /api/v1/items/{item_id}`: Get item details.
- `PUT /api/v1/items/{item_id}`: Update an item.
- `DELETE /api/v1/items/{item_id}`: Delete an item.
