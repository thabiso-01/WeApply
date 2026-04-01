# Database ER Diagram

This document contains the Entity Relationship Diagram (ERD) for the WeApply database.

## Overview

The ERD illustrates the relationships between various entities in the WeApply system. Each entity is represented as a box, with lines connecting them to indicate relationships.

## ERD Diagram

```plaintext
+-------------------+    +-------------------+
|       Users       |    |      Applications  |
+-------------------+    +-------------------+
| user_id (PK)     |    | application_id (PK)|
| name              |    | user_id (FK)      |
| email             |    | status            |
| created_at       |    +-------------------+
+-------------------+  
        |                  
        |                  
        +------------------+ 
        |                  |  
+-------------------+    +-------------------+
|      Roles        |    |   Notifications    |
+-------------------+    +-------------------+
| role_id (PK)     |    | notification_id (PK)|
| role_name        |    | user_id (FK)      |
| user_id (FK)     |    | message            |
+-------------------+    +-------------------+

// More entities can be added following the same structure.
```

## Legend
- **PK**: Primary Key
- **FK**: Foreign Key