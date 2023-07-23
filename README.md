# Doctor 
Created a simple application using Spring Initializer With required depencdencies that manages Doctors And Patients of an Organisation i.e., An User can perform some operation such as sign-In, sign-Up, update,add Doctor and get All Patients etc.

## Frame Work And Language
* Spring Boot 
* Java-17

# Data Flow 
 ## Model
   * ### Patient
        * #### Id
        * #### patientName
        * #### age
        * #### email
        * #### phoneNumber
        * #### password
        * #### gender
        * #### address
   * ### Doctor
      * #### Id
      * #### name
      * #### qualification
      * #### specialisation
      * #### contactnumber
      * #### cunsultantFee
      * #### appointment

  * ### Appointment
       * #### Id
       * #### appointmentDesc
       * #### appointmentScheduleTime
       * #### appointmentCreationTime
            
   * ### Authentication Token
        * #### tokenId
        * #### token
        * #### tokenCreationDate
        * #### @OneToOne -> User 

   * ### Admin 
        * #### Id
        * #### adminname
        * #### adminEmail
        * #### adminPassword     
 * ## Dto
   * ### SignInInput 
     * #### email
     * #### password
   * ### SignUpOutput  
     * #### signUpStatus
     * #### signUpStatusMessage  
                
## Controller
  * ### Patient Controller
    * #### signInPatient
    * #### signUpPatient
    * #### sigOutPatient
    * #### getAllPatients
    * #### scheduleAppointment
    * #### cancelAppointment

  * ### Doctor Controller  
    * #### addDoctor
    * #### getAllDoctor

  * ### Appointment Controller  
    * #### getAllAppointments
   
  * ### Admin Controller
    
## Service 
  * ### Patient Service
    * Sign In Patients
    * Sign up Patients 
    * Sign Out Patients
    * scheduleAppointment
    * cancelAppointment
    * Get all Patients 
 * ### Doctor Service
   * Add Doctor
   * Get ALLDocotr
 * ### Authentication Service
   * Save Token
   * authenticate 
## Data Structure
* String
* int
* long 

## Authors

- [@Rudra Pratap Singh](https://github.com/rudrapratapsingh2000)

