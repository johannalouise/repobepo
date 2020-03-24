# RepoBepo

A repository created by @johannaii and @louisezetterlund for testing and installing different Github Apps and Actions that are available on the Github marketplace. 

---

# Tutorial for installing an Github App or Action

### Background and Benefits/Usage with Github Apps and Actions
Some background why someone would want to use an App or Action.

#### Difference between a Github App and an Github Action
Both Github Apps and Github Actions provide ways to build tools that are useful for the toolchain in DevOps. However, they have some differences that might be necessary to take into consideration when you use or develop one.

An Github App can make an action on its own, by using the Github's API. For instance, the CI tool [Travis](https://travis-ci.com/) is testing and deploying a project by itself whenever someone make a commit to the repository.

An Github Action is ....


### How to install an Github App or Action

#### Github Marketplace
First of all, you need to visit the marketplace of Github Apps. 
Here is the link to the marketplace: [Github Marketplace](https://github.com/marketplace)

In the Github marketplace, you will find a lot of different tools that you can install and integrate to your repository at Github. Some of the tools are also integrating with other external tools such as
[Slack](https://slack.com/intl/en-se/), [Jupyter](https://jupyter.org/) and [Jira](https://www.atlassian.com/software/jira). 

#### Yaml file 
YAML stands for "YAMl Ain't Markup Language" and is a programming language that works well with other programming language and data serialization.[[1]](https://www.tutorialspoint.com/yaml/index.htm) To define and structure the data, YAMl uses indentation. When it comes to Github Apps an Actions, yaml files are mostly used for configurate the app or the action. 

Two actions where you need to add information to an yaml file are [Mjolnir](https://github.com/marketplace/actions/closes-issues-related-to-a-merged-pull-request) and [Discord Notification](https://github.com/marketplace/actions/actions-for-discord?version=0.0.2).

#### XML file
XML stands for "Extensible Markup Language" and is a markup language for encoding readable documents. [[2]](https://en.wikipedia.org/wiki/XML) To define and structure the data, XML uses tags like "< value > ".

Write the usage of an XML file with an example. For instance, Travis and the file for building the project

#### Webhooks
Write the usage of Webhooks with an example. For instance, the [Discord Notification](https://github.com/marketplace/actions/actions-for-discord?version=0.0.2) you need to add their webwook to your account.

### References 

[1] https://www.tutorialspoint.com/yaml/index.htm 

[2] https://en.wikipedia.org/wiki/XML
