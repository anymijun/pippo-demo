/*
 * Copyright (C) 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.pippo.demo.guice;

import com.google.inject.Inject;
import ro.pippo.controller.ControllerApplication;
import ro.pippo.core.route.Router;
import ro.pippo.demo.common.ContactService;

/**
 * @author James Moger
 */
public class GuiceApplication2 extends ControllerApplication {

    @Inject
    private ContactService contactService;

    @Override
    protected void onInit() {
        // add routes for static content
        addPublicResourceRoute();
        addWebjarsResourceRoute();

        GET("/", ContactsController2.class, "index");
    }

    public ContactService getContactService() {
        return contactService;
    }

    @Override
    @Inject
    public void setRouter(Router router) {
        super.setRouter(router);
    }

}
