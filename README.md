# Mom's Cafe: A Spring MVC Learning Project

Welcome to **Mom's Cafe**! This project was created as a hands-on way to dive deep into the basics of Spring MVC, exploring the core concepts and configurations needed to build a dynamic web application. 

## Project Overview

**Mom's Cafe** is a simple, yet educational, dynamic web project built using Spring MVC. The project demonstrates the foundational principles of MVC architecture, focusing on full configuration customization, including servlet mapping, IoC setup, and view resolution.

### Key Features

- **Dynamic Web Project**: The project is structured as a dynamic web project, providing a real-world context for learning Spring MVC.

- **Servlet Configuration**: 
  - The `web.xml` file is used to map the `DispatcherServlet`, the core of Spring MVC.
  - A custom MVC dispatcher servlet configuration file named `bean.xml` is integrated using the `init-param` tag.

- **IoC Configuration with Annotations**:
  - The `context:component-scan` tag in `bean.xml` is used to configure IoC objects, leveraging annotations for streamlined bean management.

- **Customizable View Resolution**:
  - The `InternalResourceViewResolver` is customized in `bean.xml` to allow flexible prefix and suffix configuration for views, making it easy to manage and update view paths.

### Project Functionality

In **Mom's Cafe**, users can interact with a simple website where they can input a dish name. This input is dynamically processed and sent to another page, where the order is confirmed, displaying the dish name. This functionality showcases the ability to:

- Populate dynamic data on web pages.
- Transfer data seamlessly between different web pages.

### Screenshots

#### Landing Page

![Landing Page](https://private-user-images.githubusercontent.com/60290691/359990250-68f68e1a-16ea-4e11-82b2-cb9b0d294c1d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQyNTYwMjIsIm5iZiI6MTcyNDI1NTcyMiwicGF0aCI6Ii82MDI5MDY5MS8zNTk5OTAyNTAtNjhmNjhlMWEtMTZlYS00ZTExLTgyYjItY2I5YjBkMjk0YzFkLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODIxVDE1NTUyMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTk4Nzc4M2U2ZTRkNTFjMjUxMmY5ZmYyYjVlYWQ1NGEzMDA0MjE4MzE0Y2VmNTE0YWEwZGMxMWFiZTVlYzRmN2ImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.kqdPg52DbKErTz7N08v8ETH2hJyVjON0mrFhEkIIfsk)
*The landing page where users first land on the website.*

#### Home Page

![Home Page](https://private-user-images.githubusercontent.com/60290691/359990267-c78710cb-b1b1-44fc-b3d1-96034bb2b3a8.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQyNTYwMjIsIm5iZiI6MTcyNDI1NTcyMiwicGF0aCI6Ii82MDI5MDY5MS8zNTk5OTAyNjctYzc4NzEwY2ItYjFiMS00NGZjLWIzZDEtOTYwMzRiYjJiM2E4LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODIxVDE1NTUyMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTU4OWNhN2MwNjMxMzQ0ZmY2Yzg1YzZhNThkMGUyMGUzMDQyZDVjZGM4YmJmMzBiODM1MjAzY2Q5MGY0MjE2ZjgmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.jxbfrIe4WpeZNZjvmooIO6jdwVNSnlCdrRSDtH_vrCo)
*The main page where users input their dish name.*

#### Order Confirmation Page

![Order Confirmation Page](https://private-user-images.githubusercontent.com/60290691/359990280-0766b2d4-053d-45de-bc98-3a5fc9d3faac.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQyNTYwMjIsIm5iZiI6MTcyNDI1NTcyMiwicGF0aCI6Ii82MDI5MDY5MS8zNTk5OTAyODAtMDc2NmIyZDQtMDUzZC00NWRlLWJjOTgtM2E1ZmM5ZDNmYWFjLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODIxVDE1NTUyMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWRhNDAxYzBkZTBhYjM4ZDU3YWQ4ZTBiMzM2OTcwZWZhMjIyZTlhZmNlYTNlMjFlODhkYTdhMDk1YjE4NzI2OTQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.E5FajL4O9wL919tq96PNgJqCg1U0Ji-xuCvMHb1wxtM)
*The page displaying the order confirmation with the dish name.*

### Learning Outcomes

By building **Mom's Cafe**, I gained a comprehensive understanding of:

- Setting up a Spring MVC project with full configuration customization.
- Mapping servlets and configuring dispatcher servlets via `web.xml` and `bean.xml`.
- Implementing IoC with annotation-based configuration.
- Customizing view resolution to manage view paths effectively.
- Developing a simple yet dynamic web application that handles user input and displays responses.

## Getting Started

To run the project locally:

1. Clone the repository.
2. Import the project into your preferred IDE.
3. Build and deploy the project on a compatible server (e.g., Tomcat).
4. Access the website via `http://localhost:8080/my-first-mvc-project`.

## Conclusion

**Mom's Cafe** is more than just a simple web application—it's a stepping stone into the world of Spring MVC. Through this project, I've not only learned the basics but also explored advanced configuration options, setting the foundation for more complex projects in the future.
