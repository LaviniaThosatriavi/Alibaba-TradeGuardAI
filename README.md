# TradeGuard AI - A LightGBM-based Merchant Credit Rating System

With the aim of enhancing Alibaba International's Trade Assurance system, TradeGuard AI utilizes a LightGBM regression model to assess and predict merchant credit ratings with high accuracy. To ensure seamless integration with Alibaba's existing technology stack, we generate a PMML (Predictive Model Markup Language) file and produced a Java evaluator. 


## Workflow

Nexus Solutions has developed TradeGuard AI to automate seller credit standings computation based on a comprehensive set of seller attributes. Here’s a summary of the approach:

1. **Data Preparation**:
   - We utilize historical seller data, including business registration and performance metrics, to train our model.
   - Data is split into training (80%) and test (20%) datasets.

2. **Modeling**:
   - We employ a LightGBM regression model, tuned and optimized using the PyCaret library.
   - Hyperparameter tuning and bootstrap aggregating are performed to achieve optimal model performance.

3. **PMML Conversion**:
   - The trained model is converted into PMML (Predictive Model Markup Language) format using the `sklearn2pmml` API.
   - This PMML file can be seamlessly integrated into Java applications, allowing Alibaba International to deploy the model within their existing technology stack.

4. **Java Integration**:
   - The PMML model is loaded and evaluated using Java-based libraries.
   - The model is then used to predict new data points and integrate seamlessly with Alibaba’s data processing pipelines.


## Data Extraction

Seller data and transaction volume are extracted from Alibaba’s databases and OneTouch’s export services using various technologies:
- JDBC, ODBC, RESTful APIs
- Apache Kafka for real-time data streaming'

  
## Project Background

Alibaba.com is a global leader in e-commerce, known for its innovation and efficiency. Nexus Solutions introduces TradeGuard AI to bolster Alibaba’s Trade Assurance system with enhanced transparency and precision in merchant credit ratings. 

Alibaba’s current system requires merchants to deposit cash for swift refunds based on their credit standings, which are determined by a points-based penalty system for violations. TradeGuard AI aims to improve this process by providing a more transparent and objective credit rating system, reducing subjectivity and enhancing Alibaba’s competitive edge.

By integrating TradeGuard AI with Alibaba’s tech stack, we aim to:
- Improve transparency in credit standings.
- Optimize fund management and operational efficiency.
- Attract more merchants by offering a fair and objective rating system.

