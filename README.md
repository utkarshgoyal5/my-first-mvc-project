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
