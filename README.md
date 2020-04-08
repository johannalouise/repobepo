# Tutorial for installing an GitHub App or Action

## Table of contents
1. [Background and benefits of GitHub Apps and Actions](#back)

    1.1. [Difference between GitHub Apps and Actions](#diff)
2. [How to install a GitHub App or Action]("how)

    2.1 [Prerequisites](#pre)
    
    2.2 [GitHub market](#market)
    
    2.2.1 [How to install the app Slack + Github](#slack)
    
    2.3 [YAML](#yaml)
    
    2.3.1 [How to install GitHub Action Mjolnir using YAML](#mjolnir)
    
    2.4 [XML](#xml)
    
    2.4.1 [How to install the GitHub App Travis using XML](#travis)
    
    2.5 [Webhooks](#web)
    
    2.5.1 [How to install GitHub Action Discord using webhooks](#discord)
    
[References](#ref)

<a name="back"> </a>

## Background and Benefits/Usage with GitHub Apps and Actions
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

<a name="diff"> </a>

#### Difference between a GitHub App and an GitHub Action
Both GitHub Apps and GitHub Actions provide ways to build tools that are useful for the toolchain in DevOps. However, they have some differences that might be necessary to take into consideration when you use or develop one.

An GitHub App can make an action on its own, by using the GitHub's API. For instance, the CI tool [Travis](https://travis-ci.com/) is testing and deploying a project by itself whenever someone make a commit to the repository.

An GitHub Action is a less complicated version of GitHub Apps, since it can run directly on runner machines or in 
Doctrine containers and you don't need to deploy any code or serve an app in order to use it [[3]](https://help.github.com/en/actions/building-actions/about-actions#comparing-github-actions-to-github-apps).

<a name="how"> </a>

## How to install an GitHub App or Action

<a name="pre"> </a>

### Prerequisites
To be able to install an Github app or action you will need the following:
* A Github account
* A Github repository

If you do not have a Github account or repository yet, please follow [Github's guide](https://help.github.com/en/github/getting-started-with-github/signing-up-for-a-new-github-account) before continue this one.

<a name="market"> </a>

### Github Marketplace
First of all, you need to visit the marketplace of Github Apps. 
Here is a link to the current available apps and actions in the marketplace: [Github Marketplace](https://github.com/marketplace)

![](/images/github_marketplace_apps_actions.png)

In the Github marketplace, you will find a lot of different tools that you can install and integrate to your repository at Github. Some of the tools are also integrating with other external tools such as
[Slack](https://slack.com/intl/en-se/), [Jupyter](https://jupyter.org/) and [Jira](https://www.atlassian.com/software/jira). To demonstrate how to install an app or action from the marketplace, we will use the app [Slack + Github](https://github.com/marketplace/slack-github).

<a name="slack"> </a>

#### How to install the app [Slack + Github](https://github.com/marketplace/slack-github)

##### Prerequisites
* A Slack account
* A workspace in Slack

If you do not have a Slack account or workspace, please follow the guide on Slacks own 
[website](https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwif55LKy8ToAhUX5ZoKHX45Bx8YABAAGgJsbQ&ohost=www.google.com&cid=CAASEuRortX0GkgC4HvQYVOza5oKqA&sig=AOD64_0PQM7w4K-o45aoLOP1dIHoHc2pcg&q=&ved=2ahUKEwjU_IzKy8ToAhVLY5oKHTusCCYQ0Qx6BAgaEAE&adurl=) 
before you continue with this tutorial.

Firstly, you need to click on the button "Set up a plan", then you will be re-directed to the bottom of the page where you 
will see a green button with the text "Install it for free". 

![](/images/github_marketplace_slack.png)

After clicking on the "Install it for free"-button, you will be re-directed to another page where you need to review your 
order and begin the installation by clicking on the button "Complete order and begin installation".

![](/images/slack_review_order.png)

You will be able to choose if you want the app to be installed on all repositories or only selected ones, and confirm you
 choice with your password.

After you have installed the "Slack + Github" app for one of your repository, you need to go to your Slack account and 
install the Github application there too. You will find the application in the "Apps" section in the sidebar. Click on the 
"Add" button, and then you will be re-directed to Slack's tutorial on how to install the Github app in one of your workspaces.

![](/images/slack_apps_view.png)

In Slack's guide, you will receive information on how to subscribe specific repositories to a workspace and a channel, 
but also how to take action in the Slack application. After you have read through Slack's guide on how you use their 
Github application, you click on the "Add to Slack" button.

![](/images/slack_guide_github.png)

You will be able to decide which channels the Github application will have access to. After you have decided that, you 
click on the "Install" button at the bottom of the page. Shortly after you have clicked on the button, you will be 
re-directed to the workspace in Slack that you have chosen for the installation. After a few minutes, you should have 
received a direct message from the Github application in you Slack workspace telling you that you have successfully 
installed GitHub on this Slack workspace.

![](/images/successfully_installed_slack_app.png)

Now you have successfully installed the Github application in your Slack workspace. However, you will need to subscribe 
to you repository and connect your Github account to the workspace. 

First of all, you will need to write the command /github subscribe owner/repository, where owner is the owner's Github 
username and repository is the URL to the repository you want to connect to Slack. After you have done that, you will 
receive a new direct message from the Github app with a confirmation link where you need to log in to you github account 
to finish the installation. 

Now you are all set up and have connected your Github repository to your Slack workspace! If you want to know how you 
customize your Github notifications in Slack, please follow this [link](https://slack.com/intl/en-se/help/articles/232289568-GitHub-for-Slack) 
to Slack's own guide.

<a name="yaml"> </a>

### YAML file 
YAML stands for "YAML Ain't Markup Language" and is a programming language that works well with other programming language 
and for data serialization.[[4]](https://www.tutorialspoint.com/yaml/index.htm) To define and structure the data, YAMl uses 
indentation with spaces. [[8]](https://www.codeproject.com/Articles/1214409/Learn-YAML-in-five-minutes) The YAML language is often 
used in applications where data is being stored or transmitted, but also for configuration files. [[9]](https://en.wikipedia.org/wiki/YAML) When 
it comes to Github Apps an Actions, YAML files are often used for configurate the app or the action in a repository. 

<a name="mjolnir"> </a>

#### How to install GitHub Action Mjolnir by using a YAML file
 [Mjolnir](https://github.com/marketplace/actions/closes-issues-related-to-a-merged-pull-request) is a GitHub Action that
 automatically closes multiple issues related to a pull request.

You can find Mjolnir when searching GitHub Marketplace.

![](/images/mjolnir-site.png)

Press the button 'Use the latest version'. This will show you following page:

![](/images/mjolnir-yml.png)

This text is yaml-code that you need to copy and paste into a .yml-fil in your repository. This file should be in a 
directory called "workflows" in a directory called ".github".

![](/images/yml-intellij.png) 

And this is enough for you to use this action in your GitHub.

<a name="xml"> </a>

### XML file
XML stands for "Extensible Markup Language" and is a markup language for encoding readable documents. 
[[5]](https://en.wikipedia.org/wiki/XML) To define and structure the data, XML uses tags like "< value > ". 
XML provides to access information and make it easier for application use, store, display and transmit data. 
[[10]](https://www.ibm.com/support/knowledgecenter/ssw_ibm_i_73/rzamj/rzamjintrouses.htm). When it comes to Github Apps and Actions, 
XML files are often used for building a POM (Project Object Model) unit which is needed if you want to build a Maven project. 
[[11]](https://www.tutorialspoint.com/maven/maven_pom.htm)

<a name="travis"> </a>

#### How to install GitHub app Travis by using a XML file
To install Travis, you'll first need to visit their [webpage](http://travis-ci.org/). Choose 'Sign in', and you will be
redirected to sign in using you GitHub-account. 

![](/images/travis-signin.png) 

After 'Sign in' you need to give Travis access to your repositories. This doesn't mean that it will affect your repositories
before you actually add the files, so don't worry if it lists a repository that you're not in charge of.

![](/images/travis1.png) 

![](/images/travis2.png) 

<a name="web"> </a>

### Webhooks
According to Wikipedia, webhooks are user-defined HTTP callbacks that are triggered by a certain event or action. 
An example of a typical event that triggers a webhook is when someone is pushing code to a repository.
[[6]](https://en.wikipedia.org/wiki/Webhook). Webhooks are used to provide and deliver data to other applications as 
the event or action happens. This makes webhooks efficient both for the provider and the consumer. [[7]](https://sendgrid.com/blog/whats-webhook/)

<a name="discord"> </a>

#### How to install GitHub action Discord Message Notify by using Webhooks

##### Prerequisites
* A Discord account
* A Discord server with a channel

In this tutorial, we will show you how to install the Github action [Discord Message Notify](https://github.com/marketplace/actions/discord-message-notify) in the video below. If you do not have a Discord account, please visit Discord's own [website](https://discordapp.com) and create one before continue with the video tutorial. 

The lines for the discord.yml that we use in the video:

```
name: discord message
on: [push]
jobs:

  build:
    name: Build
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@master
    - name: send custom message with args
      uses: appleboy/discord-action@master
      with:
        webhook_id: ${{ secrets.WEBHOOK_ID }}
        webhook_token: ${{ secrets.WEBHOOK_TOKEN }}
        color: "#00FFB9"
        username: "Cat Bot"
        message: "A new commit has been pushed to johannalouise/repo."

```



<a name="ref"> </a>

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


