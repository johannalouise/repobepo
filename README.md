# RepoBepo

A repository created by @johannaii and @louisezetterlund for testing and installing different Github Apps and Actions that are available on the Github marketplace. 

---

# Tutorial for installing an Github App or Action

## Background and Benefits/Usage with Github Apps and Actions
There are a few buzz words in the tech business and two of them are 'agile' and 'DevOps'. Just as the agile way
of working is used to minimize misunderstandings between the customer and the company, DevOps is used to make
sure the development of a service is efficient and contains as few errors as possible. Just like agile principles are 
that you are working in short sprints and deliver often, DevOps principles is to shorten the development cycle and
provide continuous delivery [[1.0]](https://en.wikipedia.org/wiki/DevOps). DevOps is also used to make the cycle more 
smooth between the different parts of the project (such as backend, frontend) and make the team work more efficient and 
homogeneous. 

#### Difference between a Github App and an Github Action
Both Github Apps and Github Actions provide ways to build tools that are useful for the toolchain in DevOps. However, they have some differences that might be necessary to take into consideration when you use or develop one.

An Github App can make an action on its own, by using the Github's API. For instance, the CI tool [Travis](https://travis-ci.com/) is testing and deploying a project by itself whenever someone make a commit to the repository.

An Github Action is ....


## How to install an Github App or Action

### Github Marketplace
First of all, you need to visit the marketplace of Github Apps. 
Here is the link to the marketplace: [Github Marketplace](https://github.com/marketplace)

In the Github marketplace, you will find a lot of different tools that you can install and integrate to your repository at Github. Some of the tools are also integrating with other external tools such as
[Slack](https://slack.com/intl/en-se/), [Jupyter](https://jupyter.org/) and [Jira](https://www.atlassian.com/software/jira). 

ADD A PICTURE OF GITHUB MARKETPLACE + ONE EXAMPLE OF AN APP/ACTION IN THE MARKETPLACE

### YAML file 
YAML stands for "YAML Ain't Markup Language" and is a programming language that works well with other programming language and for data serialization.[[1]](https://www.tutorialspoint.com/yaml/index.htm) To define and structure the data, YAMl uses indentation with spaces. [[5]](https://www.codeproject.com/Articles/1214409/Learn-YAML-in-five-minutes) The YAML language is often used in applications where data is being stored or transmitted, but also for configuration files. [[6]](https://en.wikipedia.org/wiki/YAML) When it comes to Github Apps an Actions, YAML files are often used for configurate the app or the action in a repository. 

#### How to install app/action **** by using a YAML file
Two actions where you need to add information to an yaml file are [Mjolnir](https://github.com/marketplace/actions/closes-issues-related-to-a-merged-pull-request) and [Discord Notification](https://github.com/marketplace/actions/actions-for-discord?version=0.0.2).

### XML file
XML stands for "Extensible Markup Language" and is a markup language for encoding readable documents. [[2]](https://en.wikipedia.org/wiki/XML) To define and structure the data, XML uses tags like "< value > ". XML provides to access information and make it easier for application use, store, display and transmit data. [[7]](https://www.ibm.com/support/knowledgecenter/ssw_ibm_i_73/rzamj/rzamjintrouses.htm). When it comes to Github Apps and Actions, XML files are often used for building a POM (Project Object Model) unit which is needed if you want to build a Maven project. [[8]](https://www.tutorialspoint.com/maven/maven_pom.htm)

#### How to install the app Travis by using a XML file
Add a tutorial for Travis

### Webhooks
According to Wikipedia, webhooks are user-defined HTTP callbacks that are triggered by a certain event or action. An example of a typical event that triggers a webhook is when someone is pushing code to a repository.[[3]](https://en.wikipedia.org/wiki/Webhook). Webhooks are used to provide and deliver data to other applications as the event or action happens. This makes webhooks efficient both for the provider and the consumer. [[4]](https://sendgrid.com/blog/whats-webhook/)

#### How to install the action Discord Notification by using Webhooks
Add a tutorial for Webhooks. For instance, the [Discord Notification](https://github.com/marketplace/actions/actions-for-discord?version=0.0.2) you need to add their webwook to your account.


### References 

[1.0] https://en.wikipedia.org/wiki/DevOps

[1] https://www.tutorialspoint.com/yaml/index.htm 

[2] https://en.wikipedia.org/wiki/XML

[3] https://en.wikipedia.org/wiki/Webhook

[4] https://sendgrid.com/blog/whats-webhook/

[5] https://www.codeproject.com/Articles/1214409/Learn-YAML-in-five-minutes

[6] https://en.wikipedia.org/wiki/YAML

[7] https://www.ibm.com/support/knowledgecenter/ssw_ibm_i_73/rzamj/rzamjintrouses.htm

[8] https://www.tutorialspoint.com/maven/maven_pom.htm


