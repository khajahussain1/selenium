package manual_interview_question;

public class SDLC_and_STLC {
	
	/*
   SDLC consists of following activities:

   Phase 1: Requirement collection and analysis
   Phase 2: Feasibility study:
   Phase 3: Design:
   Phase 4: Coding:
   Phase 5: Testing:
   Phase 6: Installation/Deployment:
   Phase 7: Maintenance:
   
   In this tutorial, I have explained all these phases

   Phase 1: Requirement collection and analysis:
       The requirement is the first stage in the SDLC process. It is conducted by the senior team members with inputs 
       from all the stake holders and domain experts in the industry. Planning for the quality assurance requirements 
       and recognization of the risks involved is also done at this stage.

     This stage gives a clearer picture of the scope of the entire project and the anticipated issues, opportunities, 
     and directives which triggered the project.

     Requirements Gathering stage need teams to get detailed and precise requirements. This helps companies to finalize
     the necessary time line to finish the work of that system.

    Phase 2: Feasibility study:
     Once the requirement analysis phase is completed the next step is to define and document software needs. 
     This process conducted with the help of 'Software Requirement Specification' document also known as 'SRS' document.
      It includes everything which should be designed and developed during the project life cycle.

    There are mainly five types of feasibilities checks:

    Economic: Can we complete the project within the budget or not?
    Legal: Can we handle this project as cyber law and other regulatory framework/compliances.
    Operation feasibility: Can we create operations which is expected by the client?
    Technical: Need to check whether the current computer system can support the software
    Schedule: Decide that the project can be completed within the given schedule or not.
    
  Phase 3: Design:
   In this third phase, the system and software design documents are prepared as per the requirement specification 
   document. This helps define overall system architecture.

   This design phase serves as input for the next phase of the model.

   There are two kinds of design documents developed in this phase:

    High-Level Design (HLD)

    Brief description and name of each module
    An outline about the functionality of every module
    Interface relationship and dependencies between modules
    Database tables identified along with their key elements
    Complete architecture diagrams along with technology details
    
  Low-Level Design(LLD)

   Functional logic of the modules
   Database tables, which include type and size
   Complete detail of the interface
   Addresses all types of dependency issues
   Listing of error messages
   Complete input and outputs for every module
   
   Phase 4: Coding:
    Once the system design phase is over, the next phase is coding. In this phase, developers start build the entire 
    system by writing code using the chosen programming language. In the coding phase, tasks are divided into units or 
    modules and assigned to the various developers. It is the longest phase of the Software Development Life Cycle
     process.

    In this phase, Developer needs to follow certain predefined coding guidelines. They also need to use programming 
    tools like compiler, interpreters, debugger to generate and implement the code.

  Phase 5: Testing:
   Once the software is complete, and it is deployed in the testing environment. The testing team starts testing the
    functionality of the entire system. This is done to verify that the entire application works according to the 
    customer requirement.

    During this phase, QA and testing team may find some bugs/defects which they communicate to developers. 
    The development team fixes the bug and send back to QA for a re-test. This process continues until the software 
    is bug-free, stable, and working according to the business needs of that system.

   Phase 6: Installation/Deployment:
    Once the software testing phase is over and no bugs or errors left in the system then the final deployment process 
    starts. Based on the feedback given by the project manager, the final software is released and checked for 
    deployment issues if any.

  Phase 7: Maintenance:
    Once the system is deployed, and customers start using the developed system, following 3 activities occur

   Bug fixing - bugs are reported because of some scenarios which are not tested at all
   Upgrade - Upgrading the application to the newer versions of the Software
   Enhancement - Adding some new features into the existing software
   
   
   Below are the phases of STLC:

   1. Requirement Analysis
   2. Test Planning
   3. Test case development
   4. Test Environment setup
   5. Test Execution
   6. Test Cycle closure
   Each of these stages has a definite Entry and Exit criteria, Activities & Deliverables associated with it.
   
   What is Entry and Exit Criteria?
   Entry Criteria: Entry Criteria gives the prerequisite items that must be completed before testing can begin.
   Exit Criteria: Exit Criteria defines the items that must be completed before testing can be concluded
   You have Entry and Exit Criteria for all levels in the Software Testing Life Cycle (STLC)
   
   1. Requirement Analysis
    During this phase, test team studies the requirements from a testing point of view to identify the testable 
    requirements.

   The QA team may interact with various stakeholders (Client, Business Analyst, Technical Leads, System Architects etc)
    to understand the requirements in detail.

    Requirements could be either Functional (defining what the software must do) or Non Functional (defining system 
    performance /security availability )
    
    Automation feasibility for the given testing project is also done in this stage.

  Activities

   Identify types of tests to be performed. 
   Gather details about testing priorities and focus.
   Prepare Requirement Traceability Matrix (RTM).
   Identify test environment details where testing is supposed to be carried out. 
   Automation feasibility analysis (if required).
   
   Deliverables
   RTM
   Automation feasibility report. (if applicable)
   
   2. Test Planning
    Typically, in this stage, a Senior QA manager will determine effort and cost estimates for the project and would 
    prepare and finalize the Test Plan. In this phase, Test Strategy is also determined.

  Activities

   Preparation of test plan/strategy document for various types of testing
   Test tool selection 
   Test effort estimation 
   Resource planning and determining roles and responsibilities.
   Training requirement
   Deliverables 
   Test plan /strategy document.
   Effort estimation document.
   
   
  3. Test Case Development
   This phase involves the creation, verification and rework of test cases & test scripts. Test data, is 
   identified/created and is reviewed and then reworked as well.

   Activities

   Create test cases, automation scripts (if applicable)
   Review and baseline test cases and scripts 
   Create test data (If Test Environment is available)
   
   Deliverables 
   Test cases/scripts 
   Test data
   
  4. Test Environment Setup
   Test environment decides the software and hardware conditions under which a work product is tested. Test 
   environment set-up is one of the critical aspects of testing process and can be done in parallel with Test Case 
   Development Stage. Test team may not be involved in this activity if the customer/development team provides the test
   environment in which case the test team is required to do a readiness check (smoke testing) of the given environment.
   
   Activities 

   Understand the required architecture, environment set-up and prepare hardware and software requirement list for the 
   Test Environment. 
   Setup test Environment and test data 
   Perform smoke test on the build
   
   Deliverables 
   Environment ready with test data set up 
   Smoke Test Results.
   
  5. Test Execution
   During this phase, the testers will carry out the testing based on the test plans and the test cases prepared. 
   Bugs will be reported back to the development team for correction and retesting will be performed.

  Activities

  Execute tests as per plan
  Document test results, and log defects for failed cases 
  Map defects to test cases in RTM 
  Retest the Defect fixes 
  Track the defects to closure
  
  Deliverables 
  Completed RTM with the execution status
  Test cases updated with results
  Defect reports
  
 5. Test Cycle Closure
  Testing team will meet, discuss and analyze testing artifacts to identify strategies that have to be implemented in
  the future, taking lessons from the current test cycle. The idea is to remove the process bottlenecks for future test 
  cycles and share best practices for any similar projects in the future.

  Activities

  Evaluate cycle completion criteria based on Time, Test coverage, Cost,Software, Critical Business Objectives, Quality
  Prepare test metrics based on the above parameters. 
  Document the learning out of the project 
  Prepare Test closure report 
  Qualitative and quantitative reporting of quality of the work product to the customer. 
  Test result analysis to find out the defect distribution by type and severity.
  
  Deliverables 
  Test Closure report 
  Test metrics
  
*/

}
