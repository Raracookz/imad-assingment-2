
# Virtual Pet App
![WELCOME GIF](https://github.com/Raracookz/imad-assingment-2/assets/162429322/9975ef2f-582a-4341-a1f2-f942d7bd230e)

The importance of mobile applications in today's technologically advanced environment cannot be emphasized. They have brought about a significant change in our technological environment by transforming the way we communicate, work, and relax. This report outlines the development process for this new mobile application. The app aims to allow users into a game where they can play, feed, and clean a virtual pet while keeping a close eye on the pet's health, hunger, and cleanliness status. This report will cover the initial concept, design, development, testing, and deployment phases of the project.



## Concept
The original handheld electronic toy Tamagotchi, which became famous in the 1990s, served as the inspiration for Tamagotchi apps, which are digital simulations of virtual pets. The virtual pet app was designed to give users the impression that they are taking care of a virtual pet by feeding, playing with, cleaning and meeting all its needs to keep it happy and healthy. Within the app, clicking on the app the user is welcomed and introduced to the pet. After clicking the start button, the user is directed to a second screen containing: 

-Feed button 

-Clean button 

-Play button 

-Display screen for pet 

-Status of pet section 

Each time the user clicks either one of the buttons, a different animation is displayed and the values of the status of the pet are changed. 

## Design Phase
In the design phase, the developer (myself) focused on creating a user-friendly interface with intuitive navigation. Since the app catered to younger and older minds, the user interface is very simple and easy to follow. Wireframes and mockups were developed to visualize the layout and functionality of the app. The app’s background was created by me through a studio called “canvas” and the custom font is extracted from a site called Dafont: // https://www.dafont.com/lobster-bisque.font //.  The virtual pet figure was created through a apple service called memoji and the animations were done by the developer (myself). Potential users' feedback was considered to ensure the design satisfies their requirements and tastes. Many outside perspectives made the process much simpler to understand.  For many reasons, it is essential to design an interface with younger children in mind. First, children require interfaces that are simple to use and intuitive because they have different cognitive capacities and developmental stages than adults. Children may become disengaged or quit a platform due to complex interfaces frustrating them. Secondly, learning and discovery are promoted by a well-designed child interface. Children are encouraged to interact with the interface through exciting images, age-appropriate language, and interactive aspects, which foster curiosity and information acquisition. In addition, a kid-friendly interface can help increase optimal views about the process and experience with the app. Thirdly; while creating interfaces for younger users, safety considerations take precedence. Children can be protected from potential risks linked with internet usage by implementing features like parental controls, age-appropriate material screening, and explicit directions for online behavior. All things considered, designing interfaces for a wide variety of audiences that are suited to their abilities and requirements not only improves their user experience but also fosters digital literacy, cognitive development, and internet safety. The program is designed with younger minds in mind, but adults and retirees can also use it to learn a little bit about what newly developed technologies provide in the modern world. 
## Development
Using the Kotlin programming language, the project is configured as an Android app. On the first screen, a start button is coded to direct the user to the second screen by using a setOnClickListener function. All dependencies required to develop Android apps are included. An activity in the Android application is indicated by the fact that the `Virtual` class extends {AppCompatActivity`. After the activity is formed, the `onCreate` method is altered to set it up. A file called `activity_virtual.xml` defines the layout for this activity. It includes views such as `gifImageView} and buttons for playing, cleaning, and feeding the virtual pet. Using `findViewById`, references to UI elements like `gifImageView` and buttons ({feedButton{, {cleanButton{, {playButton{) are discovered inside the `onCreate` method. For every button ({feedButton}, `cleanButton}, `playButton}), click listeners are configured. Every button that is clicked sets off a distinct action (`feedPet`, `cleanPet`, `playWithPet}) and modifies the pet's picture and status in line with it. Depending on the action taken, the `feedPet`, `cleanPet`, and `playWithPet` functions change the pet's attributes (`cleanliness`, `health}, and `hunger`). Additionally, these functions guarantee that the attribute values stay within predetermined ranges. The `updateStatusText` function modifies the `statusText1} TextView by adding the pet's current `health`, `hunger`, and `cleanliness` characteristics. When the pet performs an action, the code updates the pet's image by referencing images ({R.drawable.sharkeel_eating}, `R.drawable.sharkeel_cleaned}, `R.drawable.sharkeel_playing}). The setup of the activity, initializing UI components, establishing button click listeners, implementing pet actions, updating UI elements based on actions, and managing image resources are all part of the development process. 
## GitHub/Testing
Taskify uses GitHub and GitHub Actions to facilitate version control, collaborative development, and process automation. The complete source code, including frontend (HTML, CSS, JavaScript) and backend (Node.js, Express) components, is stored in the GitHub repository. To help developers and users alike, comprehensive documentation that includes installation instructions, usage guidelines, and API specs is easily accessible within the repository. GitHub Actions is essential to Taskify because it helps automate a variety of operations, including deployment, testing, and continuous integration. Code quality is ensured and regressions are prevented using automated test suites that are triggered upon code push. Faster feedback loops are created via the CI pipeline, which automates the building, testing, and validation of code changes. By streamlining the taskify update process in production situations, deployment automation reduces the likelihood of human mistake. Taskify is a work management tool that focuses on productivity and cooperation. Its user-friendly layout and seamless integration of GitHub and GitHub Actions give priority to the user experience. Taskify stays flexible and scalable to meet the changing needs of teams and consumers by utilizing modern development techniques and technologies. 
## References
Background found on canva at address: https://www.canva.com/design/DAGCjp1Hv68/-a2A6yiA0sL2UIt-eWFwPQ/edit 

YouTube links used to assist while developing the application:https://youtu.be/201A9z_Zzng?si=EKG2be5kLKaH4uzC; https://youtu.be/N9-6Feu93lc?si=IuyvzcPkR1HYatRg; https://youtu.be/bVMjJUvM6Yo?si=KPZles9nBK8DWHhd; https://youtu.be/FvK4diZYmTw?si=SXcqBmm4jeOG7sYl; https://youtu.be/xciVjc1o2rY?si=2-tDAVLXXNVe0_o7; https://youtu.be/hnqtShGdXto?si=PA7qelT9S7rIJTby; https://www.youtube.com/watch?v=Psg7sdm6J6c 

Font used throughtout the interfaces:https://www.dafont.com/lobster-bisque.font 

Images/Gifs  used for the pet Comes from iPhone 
## Demonstration link