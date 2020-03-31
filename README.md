# Tutorial for installing an Github App or Action

## Background and Benefits/Usage with Github Apps and Actions
There are a few buzz words in the tech business and two of them are 'agile' and 'DevOps'. Just as the agile way
of working is used to minimize misunderstandings between the customer and the company, DevOps is used to make
sure the development of a service is efficient and contains as few errors as possible. Just like agile principles are 
that you are working in short sprints and deliver often, DevOps principles is to shorten the development cycle and
provide continuous delivery [[1]](https://en.wikipedia.org/wiki/DevOps). DevOps is also used to make the cycle more 
smooth between the different parts of the project (such as backend, frontend) and make the team work more efficient and 
homogeneous. 

In order to have a smooth team work and a way to roll-back eventual unstable versions, there must be a version control system
such as GitHub. By using GitHub, there is a possibility to use tools to automate different processes of the DevOps workflow
like the build process and the test process. This is possible to do using tools built into GitHub, the version control system.
These tools are helping developers to make the flow more efficient, since it is happening automatically and the developers 
can focus on actually writing code [[2]](https://github.blog/2019-08-08-github-actions-now-supports-ci-cd/).
 
#### Difference between a Github App and an Github Action
Both Github Apps and Github Actions provide ways to build tools that are useful for the toolchain in DevOps. However, they have some differences that might be necessary to take into consideration when you use or develop one.

An Github App can make an action on its own, by using the Github's API. For instance, the CI tool [Travis](https://travis-ci.com/) is testing and deploying a project by itself whenever someone make a commit to the repository.

An Github Action is a less complicated version of GitHub Apps, since it can run directly on runner machines or in 
Doctrine containers and you don't need to deploy any code or serve an app in order to use it [[3]](https://help.github.com/en/actions/building-actions/about-actions#comparing-github-actions-to-github-apps).

## How to install an Github App or Action

### Prerequisites
To be able to install an Github app or action you will need the following:
* A Github account
* A Github repository

If you do not have a Github account or repository yet, please follow [Github's guide](https://help.github.com/en/github/getting-started-with-github/signing-up-for-a-new-github-account) before continue this one.

### Github Marketplace
First of all, you need to visit the marketplace of Github Apps. 
Here is a link to the current available apps and actions in the marketplace: [Github Marketplace](https://github.com/marketplace)

![](/images/github_marketplace_apps_actions.png)

In the Github marketplace, you will find a lot of different tools that you can install and integrate to your repository at Github. Some of the tools are also integrating with other external tools such as
[Slack](https://slack.com/intl/en-se/), [Jupyter](https://jupyter.org/) and [Jira](https://www.atlassian.com/software/jira). To demonstrate how to install an app or action from the marketplace, we will use the app [Slack + Github](https://github.com/marketplace/slack-github).

#### How to install the app [Slack + Github](https://github.com/marketplace/slack-github)

##### Prerequisites
* A Slack account
* A workspace in Slack

If you do not have a Slack account or workspace, please follow the guide on Slacks own [website](https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwif55LKy8ToAhUX5ZoKHX45Bx8YABAAGgJsbQ&ohost=www.google.com&cid=CAASEuRortX0GkgC4HvQYVOza5oKqA&sig=AOD64_0PQM7w4K-o45aoLOP1dIHoHc2pcg&q=&ved=2ahUKEwjU_IzKy8ToAhVLY5oKHTusCCYQ0Qx6BAgaEAE&adurl=) before you continue with this tutorial.

Firstly, you need to click on the button "Set up a plan", then you will be re-directed to the bottom of the page where you will see a green button with the text "Install it for free". 

![](/images/github_marketplace_slack.png)

After clicking on the "Install it for free"-button, you will be re-directed to another page where you need to review your order and begin the installation by clicking on the button "Complete order and begin installation".

![](/images/slack_review_order.png)

You will be able to choose if you want the app to be installed on all repositories or only selected ones. You will also need to confirm your choice with your Github password.

### YAML file 
YAML stands for "YAML Ain't Markup Language" and is a programming language that works well with other programming language and for data serialization.[[4]](https://www.tutorialspoint.com/yaml/index.htm) To define and structure the data, YAMl uses indentation with spaces. [[8]](https://www.codeproject.com/Articles/1214409/Learn-YAML-in-five-minutes) The YAML language is often used in applications where data is being stored or transmitted, but also for configuration files. [[9]](https://en.wikipedia.org/wiki/YAML) When it comes to Github Apps an Actions, YAML files are often used for configurate the app or the action in a repository. 

#### How to install app/action **** by using a YAML file
Two actions where you need to add information to an yaml file are [Mjolnir](https://github.com/marketplace/actions/closes-issues-related-to-a-merged-pull-request) and [Discord Notification](https://github.com/marketplace/actions/actions-for-discord?version=0.0.2).

### XML file
XML stands for "Extensible Markup Language" and is a markup language for encoding readable documents. [[5]](https://en.wikipedia.org/wiki/XML) To define and structure the data, XML uses tags like "< value > ". XML provides to access information and make it easier for application use, store, display and transmit data. [[10]](https://www.ibm.com/support/knowledgecenter/ssw_ibm_i_73/rzamj/rzamjintrouses.htm). When it comes to Github Apps and Actions, XML files are often used for building a POM (Project Object Model) unit which is needed if you want to build a Maven project. [[11]](https://www.tutorialspoint.com/maven/maven_pom.htm)

#### How to install the app Travis by using a XML file
Add a tutorial for Travis

### Webhooks
According to Wikipedia, webhooks are user-defined HTTP callbacks that are triggered by a certain event or action. An example of a typical event that triggers a webhook is when someone is pushing code to a repository.[[6]](https://en.wikipedia.org/wiki/Webhook). Webhooks are used to provide and deliver data to other applications as the event or action happens. This makes webhooks efficient both for the provider and the consumer. [[7]](https://sendgrid.com/blog/whats-webhook/)

#### How to install the action Discord Notification by using Webhooks
Add a tutorial for Webhooks. For instance, the [Discord Notification](https://github.com/marketplace/actions/actions-for-discord?version=0.0.2) you need to add their webwook to your account.


### References 

[1] https://en.wikipedia.org/wiki/DevOps

[2] https://github.blog/2019-08-08-github-actions-now-supports-ci-cd/

[3] https://help.github.com/en/actions/building-actions/about-actions#comparing-github-actions-to-github-apps

[4] https://www.tutorialspoint.com/yaml/index.htm 

[5] https://en.wikipedia.org/wiki/XML

[6] https://en.wikipedia.org/wiki/Webhook

[7] https://sendgrid.com/blog/whats-webhook/

[8] https://www.codeproject.com/Articles/1214409/Learn-YAML-in-five-minutes

[9] https://en.wikipedia.org/wiki/YAML

[10] https://www.ibm.com/support/knowledgecenter/ssw_ibm_i_73/rzamj/rzamjintrouses.htm

[11] https://www.tutorialspoint.com/maven/maven_pom.htm


