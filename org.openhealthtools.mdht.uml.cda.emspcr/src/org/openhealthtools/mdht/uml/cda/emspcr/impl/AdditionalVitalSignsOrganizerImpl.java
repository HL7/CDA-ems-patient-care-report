/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdditionalVitalSignsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AdditionalVitalSignsOrganizerImpl extends OrganizerImpl implements AdditionalVitalSignsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalVitalSignsOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerComponent4(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent4(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerComponent42(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent42(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalVitalSignsOrganizer init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalVitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AdditionalVitalSignsOrganizerImpl
